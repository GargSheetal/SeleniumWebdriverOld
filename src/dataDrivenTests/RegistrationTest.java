package dataDrivenTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//Getting data from excel sheet
		FileInputStream file = new FileInputStream("C:\\Sheetal\\QA_training\\DDTestingSelenium2.xlsx");
		
		// Creating the workbook instance for XLS file 
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		// Getting first sheet from the workbook
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		// Getting first row from the sheet
		int noOfRows = sheet.getLastRowNum();
		
		System.out.println("No. of rows in the excel sheet" + noOfRows);
		
		for(int row=1; row<=noOfRows; row++ )
		{
			XSSFRow currentRow = sheet.getRow(row);
			
			String First_name = currentRow.getCell(0).getStringCellValue();
			String Last_name = currentRow.getCell(1).getStringCellValue();
			String Phone = currentRow.getCell(2).getStringCellValue();
			String Email = currentRow.getCell(3).getStringCellValue();
			String Address = currentRow.getCell(4).getStringCellValue();
			String City = currentRow.getCell(5).getStringCellValue();
			String State = currentRow.getCell(6).getStringCellValue();
			String PinCode = currentRow.getCell(7).getStringCellValue();
			String Country = currentRow.getCell(8).getStringCellValue();
			String Username = currentRow.getCell(9).getStringCellValue();
			String Password = currentRow.getCell(10).getStringCellValue();
			
			// Registration process
			
			driver.findElement(By.linkText("Register")).click();
			
			//Entering contact Information
			driver.findElement(By.name("firstname")).sendKeys("Fist_name");
			driver.findElement(By.name("lastname")).sendKeys("Last_name");
			driver.findElement(By.name("phone")).sendKeys("Phone");
			driver.findElement(By.name("userName")).sendKeys("Email");	// Email id
			
			// Entering mailing information
			driver.findElement(By.name("address1")).sendKeys("Address");
			driver.findElement(By.name("address2")).sendKeys("Address");
			driver.findElement(By.name("city")).sendKeys("City");
			driver.findElement(By.name("state")).sendKeys("State");
			driver.findElement(By.name("postalCode")).sendKeys("PinCode");
			
			// Country Selection
			Select dropCountry=new Select(driver.findElement(By.name("country")));
			dropCountry.selectByVisibleText("Country");
			
			//Entering user information
			driver.findElement(By.name("email")).sendKeys("UserName");
			driver.findElement(By.name("password")).sendKeys("Password");
			driver.findElement(By.name("confirmPassword")).sendKeys("Password");
			
			//Submitting Form
			driver.findElement(By.name("register")).click();
			
			if(driver.getPageSource().contains("Thank You for registering"))
			{
				System.out.println("Registration completed for "+ row + " record");
				
			}
			else
			{
				System.out.println("Restration failed for "+ row + " record");
			}
		
		}
		
		System.out.println("Data Driven Test Completed");
			
		driver.close();
		driver.quit();
		
		file.close();
	}

}

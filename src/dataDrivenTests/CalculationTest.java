package dataDrivenTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalculationTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("C:\\Sheetal\\QA_training\\CalDataSeleniumTest3.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rowCount = sheet.getLastRowNum();
		
		for(int i=1; i<=rowCount; i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			// Two ways of capturing the cell value from excel sheet
			XSSFCell principle = row.getCell(0);
			int princ = (int)principle.getNumericCellValue();	// type casting
			
			int rateOfInt = (int)row.getCell(1).getNumericCellValue();	// type casting
			
			int period = (int)row.getCell(2).getNumericCellValue();
			
			String freq = row.getCell(3).getStringCellValue();
			
			int exp_mValue = (int)row.getCell(4).getNumericCellValue();
			
		//	sendKeys(String.valueOf(12345))--> used for sending numeric values 
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateOfInt));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(period));
			
			Select periodDuration = new Select(driver.findElement(By.id("tenurePeriod")));
			periodDuration.selectByVisibleText("year(s)");
			
			Select frequency = new Select(driver.findElement(By.id("frequency")));
			frequency.selectByVisibleText(freq);
			
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
			
			String actual_mValue = driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
			System.out.println(actual_mValue);
			
			if(Double.parseDouble(actual_mValue)==exp_mValue)
			{
				System.out.println("Test is passed");
			}
			else
			{
				System.out.println("Test is failed");
			}
				
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
			
		}
		
		driver.close();
		driver.quit();

	}

}

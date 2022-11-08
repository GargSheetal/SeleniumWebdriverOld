package selenium.Webdriver.BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		
		// Finding number of rows in a web table
		int rows=driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr")).size();
		System.out.println(rows);
		
		// Counting number of columns
		int col=driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr/td/h3")).size();
		System.out.println(col);
		
		// Printing the data values in the web table from rows and columns
		for(int i=2; i<=rows; i++)
		{
			for(int j=1; j<=col; j++)
			{
				System.out.print(driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr["+i+"]/td["+j+"]")).getText() + "    ");
			}
			
			System.out.println();
		}
		
				
	}

}

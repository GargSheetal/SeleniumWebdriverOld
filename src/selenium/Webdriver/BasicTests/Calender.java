package selenium.Webdriver.BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fs25.formsite.com/KAHtTf/jp2mqxsj9a/index.html?1636477903684");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"q23\"]/span")).click();
		
		Select yr=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select")));
		yr.selectByVisibleText("2021");
		
	/*	// Selecting future month and date
		for(int i=7; i>=1; i--)
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			
			String mon=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span")).getText();
			if(mon.equals("June"))
			{
				driver.findElement(By.linkText("15")).click();	//Use link text for dates
				break;
			}
			
		}*/
		
		// Selecting past month and date
				for(int i=6; i>=1; i--)
				{
					driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
					
					String mon=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span")).getText();
					if(mon.equals("May"))
					{
						driver.findElement(By.linkText("23")).click();
						break;
					}
				}
		
		
		// Also practice this site: http://demo.automationtesting.in/Datepicker.html
		
	}

}

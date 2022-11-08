package selenium.Webdriver.BasicTests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		//System.out.println(driver.getTitle()); 	//it confirms that the focus is still on the parent window.
		
		// Set class in java is used for storing multiple values
		Set <String> s = driver.getWindowHandles();	// it will return the ids of the opened windows
		
		for(String i:s) 		// Advanced for loop for getting window handles and switching between the windows
		{
			System.out.println(i);
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);
			
			if(t.contains("Selenium"))
			{
				driver.close();
			}
		}
		
		
		// https://www.formsite.com/templates/non-profit/volunteer-signup-form/
		// https://www.formsite.com/templates/human-resources/employment-application-form/
		
	}

}

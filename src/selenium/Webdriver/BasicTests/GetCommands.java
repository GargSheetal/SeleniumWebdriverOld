package selenium.Webdriver.BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle()); 
		
		System.out.println(driver.getCurrentUrl());
		
		String phn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/span/strong")).getText();
		System.out.println(phn);
		
		driver.close();	// closes current window/browser
		
		//driver.quit();	// closes multiple windows
	}

}

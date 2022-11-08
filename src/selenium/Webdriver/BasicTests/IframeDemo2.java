package selenium.Webdriver.BasicTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/button")).click();
	//	String alertText = driver.switchTo().alert().getText();
	//	System.out.println(alertText);
		
		Thread.sleep(2000);
		
		Alert alertOnPageW3 = driver.switchTo().alert();
		alertOnPageW3.sendKeys("Shama");
		alertOnPageW3.accept();
		
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
		
	}

}

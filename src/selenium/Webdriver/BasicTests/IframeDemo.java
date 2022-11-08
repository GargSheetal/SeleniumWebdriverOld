package selenium.Webdriver.BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(0); 		// here the frame is handled using index. Give the index of the frame. Index starts from 0.
		//driver.switchTo().frame("iframeResult");		// provide the name/id of the frame.
		
		WebElement frame1= driver.findElement(By.id("iframeResult")); // didn't work. look into it later on
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("/html/body/button")).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());

	}

}

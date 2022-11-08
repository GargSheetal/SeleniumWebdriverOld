package javaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Syntax
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript(Script, args);
		
		// Flash an element
		WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		JavaScriptUtil.flash(logo, driver);
		
		
		
		// Drawing border around an element and take screenshot
	/*	WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		JavaScriptUtil.drawBorder(logo, driver);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\logo.png");
		FileUtils.copyFile(src, trg);	*/
		
		
		// Getting title of the page
	/*	String title = JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);	*/
		
		// Click action
	/*	WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		JavaScriptUtil.clickElementByJS(regLink, driver);	*/
		
		
		// Generate an alert
		// JavaScriptUtil.generateAlert(driver, "This is my Alert....");
		
		
		// Refresh the page
		//JavaScriptUtil.refreshBrowserByJS(driver);
		
		
		// Scroll down the page
		//JavaScriptUtil.scrollPageDown(driver);
		
		//Thread.sleep(3000);
		
		// Scroll up the page
		//JavaScriptUtil.scrollPageUp(driver);
		
		// Zoom in and out the page
		//JavaScriptUtil.zoomPageByJS(driver);
		
		

	}

}

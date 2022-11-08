package CapturingScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Full page screenshot
	/*	TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\Screenshots\\homepage.png");
		FileUtils.copyFile(source, target);		*/
		
	/*	//Screenshot of specific section of the page
		WebElement section = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]"));
		File source = section.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\Screenshots\\featuredProducts.png");
		FileUtils.copyFile(source, target);	*/
		
		//Screenshot of a particular element on the page
		WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		File source = logo.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\Screenshots\\logo.png");
		FileUtils.copyFile(source, target);	
		
		driver.close();
		
	}

}

package selenium.Webdriver.BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult"); 	// switch to outer iframe
		driver.switchTo().frame(0); 	 // switch to inner iframe
		
		
		String innerFrameText=driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println("Text present in the inner iframe: " + innerFrameText);
		
		driver.switchTo().parentFrame(); 	// go to parent frame/outer frame
		String outerFrameText=driver.findElement(By.xpath("/html/body/p")).getText();
		System.out.println("Text present in the outer iframe: " + outerFrameText);
		
	}

}

package selenium.Webdriver.BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// 1. Scrolling by using pixel
		//js.executeScript("window.scrollBy(0, 1000)", "");
		
		// 2. Scrolling page till we find particular element
		//WebElement IndiaFlag = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
		//js.executeScript("arguments[0].scrollIntoView();", IndiaFlag);
		
		// 3. Scrolling to the bottom of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		

	}

}

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsMultipleKeys {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement input1 = driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
		WebElement input2 = driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
		
		input1.sendKeys("Welcome to Selenium");
		
		Actions act = new Actions(driver);
		
		//Ctrl A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Ctrl C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//pressing tab key
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//Ctrl V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
		{
			System.out.println("Text Copied");
		}
		else
			System.out.println("Text Not Copied");
		

	}

}

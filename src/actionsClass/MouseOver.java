package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//Interactions---> drag and drop---> static
		WebElement interactions = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a"));
		WebElement dragAndDrop = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
		WebElement stat = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/a"));
		
	/*	act.moveToElement(interactions).build().perform();	// mouse over to interactions tab
		act.moveToElement(dragAndDrop).build().perform();	// mouse over to dragAndDrop tab
		act.moveToElement(stat).click().build().perform();	// mouse over to static tab and click	*/
		
		act.moveToElement(interactions).moveToElement(dragAndDrop).moveToElement(stat).click().build().perform();
		
	}

}

package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement rightClickbtn = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		act.contextClick(rightClickbtn).build().perform();	// right click on the element
		
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();	// select the copy option
		
		String alertText = driver.switchTo().alert().getText();	//capture text from alert box
		System.out.println(alertText);
		driver.switchTo().alert().accept(); // accept the alert box
	}

}

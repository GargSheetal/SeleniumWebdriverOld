package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.id("box1"));
		WebElement target = driver.findElement(By.id("box103"));
		
		Actions act = new Actions(driver);
		
		//click and hold source element---> move to target element---> release
		//act.clickAndHold(source).moveToElement(target).release().build().perform();
		
		act.dragAndDrop(source, target).build().perform();
		
		// Practice--> http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
	}

}

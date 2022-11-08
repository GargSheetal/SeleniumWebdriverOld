package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAssignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
		
		driver.manage().window().maximize();
		
		WebElement stdA = driver.findElement(By.id("node1"));
		WebElement stdB = driver.findElement(By.id("node2"));
		WebElement stdC = driver.findElement(By.id("node3"));
		WebElement stdD = driver.findElement(By.id("node4"));
		WebElement stdE = driver.findElement(By.id("node5"));
		WebElement stdF = driver.findElement(By.id("node6"));
		WebElement stdG = driver.findElement(By.id("node7"));
		WebElement stdH = driver.findElement(By.id("node8"));
		WebElement stdI = driver.findElement(By.id("node9"));
		WebElement stdJ = driver.findElement(By.id("node10"));
		WebElement stdK = driver.findElement(By.id("node11"));
		WebElement stdL = driver.findElement(By.id("node12"));
		WebElement stdM = driver.findElement(By.id("node13"));
		WebElement stdN = driver.findElement(By.id("node14"));
		WebElement stdO = driver.findElement(By.id("node15"));
		WebElement stdP = driver.findElement(By.id("node16"));
		WebElement stdQ = driver.findElement(By.id("node17"));
		WebElement stdR = driver.findElement(By.id("node18"));
		WebElement stdS = driver.findElement(By.id("node19"));
		WebElement stdT = driver.findElement(By.id("node20"));
		WebElement stdU = driver.findElement(By.id("node21"));
		
		WebElement teamA = driver.findElement(By.id("box1"));
		WebElement teamB = driver.findElement(By.id("box2"));
		WebElement teamC = driver.findElement(By.id("box3"));
		WebElement teamD = driver.findElement(By.id("box4"));
		WebElement teamE = driver.findElement(By.id("box5"));
		
		Actions act = new Actions(driver);
		
	//	act.dragAndDrop(stdA, teamA).build().perform();
		act.clickAndHold(stdB).moveToElement(teamA).release().build().perform();
	/*	act.dragAndDrop(stdC, teamA).build().perform();
		act.dragAndDrop(stdD, teamA).build().perform();
		
		act.dragAndDrop(stdE, teamB).build().perform();
		act.dragAndDrop(stdF, teamB).build().perform();
		act.dragAndDrop(stdG, teamB).build().perform();
		act.dragAndDrop(stdH, teamB).build().perform();
		
		act.dragAndDrop(stdI, teamC).build().perform();
		act.dragAndDrop(stdJ, teamC).build().perform();
		act.dragAndDrop(stdK, teamC).build().perform();
		act.dragAndDrop(stdL, teamC).build().perform();
		
		act.dragAndDrop(stdM, teamD).build().perform();
		act.dragAndDrop(stdN, teamD).build().perform();
		act.dragAndDrop(stdO, teamD).build().perform();
		act.dragAndDrop(stdP, teamD).build().perform();
		
		act.dragAndDrop(stdQ, teamE).build().perform();
		act.dragAndDrop(stdR, teamE).build().perform();
		act.dragAndDrop(stdS, teamE).build().perform();
		act.dragAndDrop(stdT, teamE).build().perform();
		act.dragAndDrop(stdU, teamE).build().perform();	*/
		

	}

}

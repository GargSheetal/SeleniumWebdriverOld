package selenium.Webdriver.BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		//driver.close();	//closes only one window
		driver.quit();	// closes all the tabs and windows
		

	}

}

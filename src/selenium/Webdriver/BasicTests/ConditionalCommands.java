package selenium.Webdriver.BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		
		

	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Windows.html");

/*	WebElement email= driver.findElement(By.xpath("//*[@id=\"email\"]"));
	
	WebElement password= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	
	if(email.isDisplayed() && email.isEnabled())
	{
		email.sendKeys("sheetal_garg05@yahoo.co.in");
	}
	
	if(password.isDisplayed() && password.isEnabled())
	{
		password.sendKeys("drums@143");
	}
	*/
	//driver.findElement(By.name("login")).click();
	
	driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[2]/a")).click();
	
	System.out.println(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).isSelected());
	
	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click(); 
	
	//System.out.println(driver.findElement(By.id("u_e_5_SB")).isSelected());
	
	
	//a[@id="id1"][@name="value1"]
	//input[contains(@id,"email")]
	}
	
}
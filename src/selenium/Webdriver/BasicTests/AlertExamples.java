package selenium.Webdriver.BasicTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		// Alert box with OK button example
		
	/*	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(2000);
		//switch to alert
		Alert alertBox=driver.switchTo().alert();
		
		System.out.println(alertBox.getText());
		alertBox.accept();	
		driver.close();	*/
		
		// Alert box with OK and cancel button example
		
	/*	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Thread.sleep(2000);
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().dismiss();
		
		String actText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		System.out.println(actText);
		
		String expTextCancel="You Pressed Cancel";
		if(expTextCancel.equals(actText)==true)
		{
			System.out.println("Test is passed");
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		actText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		System.out.println(actText);
		String expTextAccept="You pressed Ok";
		if(expTextAccept.equals(actText)==true)
		{
			System.out.println("Test is passed");
		}
		
		driver.close();	*/
		
		
		// Alert box with text box example
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Thread.sleep(2000);
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().sendKeys("Automation Practice");
		driver.switchTo().alert().accept();
		
		String expMsg="Hello Automation Practice How are you today";
		String actMsg=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		System.out.println(actMsg);	
		
		if(expMsg.equals(actMsg)==true)
		{
			System.out.println("Test is Passed");
		}
		
		
		
		
		
		
	}

}

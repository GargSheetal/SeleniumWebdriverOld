package selenium.Webdriver.BasicTests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VolunteerSignupForm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fs25.formsite.com/KAHtTf/jp2mqxsj9a/index.html?1635783685396");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("David");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("2345677890");
		
		
		//drop down selection
		WebElement drptime=driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-5\"]"));
		Select time=new Select(drptime);
	//	time.selectByIndex(3);	// by index
	//	time.selectByValue("Radio-2");	// by value
		time.selectByVisibleText("Evening");	//by visible text
		
		System.out.println(time.getOptions().size()); // getOptions will get all the options present in the drop down box. Size method will count the number of options present in the drop down box.
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("Huntingdon Pike");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-7\"]")).sendKeys("Abington");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-8\"]")).sendKeys("PA");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-9\"]")).sendKeys("19006");
		
		// radio button selection
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"q12\"]/table/tbody/tr/td[1]/label")).isSelected());	//false
		driver.findElement(By.xpath("//*[@id=\"q12\"]/table/tbody/tr/td[1]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"q14\"]/table/tbody/tr[7]/td/label[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-11\"]")).sendKeys("Facebook");
		
		// Check boxes selection
		
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label")).click();
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[7]/td/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"q16\"]/table/tbody/tr[1]/td[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"q16\"]/table/tbody/tr[2]/td[1]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextArea-16\"]")).sendKeys("Looking forward to word with you.");
		driver.findElement(By.xpath("//*[@id=\"FSForm\"]/div[2]/div[29]/a[1]/img")).click();
		driver.navigate().back();
/*		driver.findElement(By.linkText("Report abuse")).click();
		
		Set <String> s=driver.getWindowHandles();
		
		for(String i:s)
		{	
			System.out.println(i);
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);
		
			if(t.contains("Report Abuse"))
			{
				driver.close();
			}
	
		}
		driver.switchTo().window("CDwindow-C5351C87E04E2EEA7B6E3C162B09BF8E");	*/
		
		driver.findElement(By.xpath("//*[@id=\"FSsubmit\"]")).click();
		
		Thread.sleep(3000);
		
		// Verifying form submission
		
		driver.getTitle();
		if(driver.getTitle().contains("Thank you!")==true)
		{
			System.out.println("Test is passed");
		}
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/h3")).getText());
		
		driver.close();
	}

}



// Also practice this site: http://demo.automationtesting.in/Register.html






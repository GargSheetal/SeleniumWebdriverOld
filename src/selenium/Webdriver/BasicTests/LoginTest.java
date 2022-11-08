
/* Locators: id, name, link text, XPath, 
 * CSS selectors-Cascading style sheets--> 
		tag and id, tag and class, tag and attribute, tag, class and attribute, inner text
				
		1) Tag and id: 
				driver.findElement(By.cssSelector("input#email_create")).sendKeys("trainingsheetal@gmail.com");
		2) Tag and class: 
				driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@gmail.com"); 
		3) Tag and attribute: attribute can be any property. It can be name, class, id etc. Attribute and their value is specified in square brackets.
				driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("abc123");
		4) Tag class and attribute: class is separated by dot and attribute is mentioned in square brackets with is name and value.
				driver.findElement(By.cssSelector("input.inputtext[placeholder=Password]")).sendKeys("abc123");
		5) Inner text: when the object does'nt have id, name, or class attributes, then we make use of their inner texts.
					Inner texts are the actual string patterns that the HTML label shows on the page.
				driver.findElement(By.cssSelector("font:contains("Password:")"));
		6) xPath: address of web element. 2 types of xPath: absolute and relative. 
			Absolute xPath: complete/ full address of the element in the web page. (Complete xPath). It only has multiple single /
			Relative: partial address of the element in the web page. (Partial xPath). Always start with //
		
	Writing xPath manually:
	Absolute xPath--> 
	Relative xPath--> //tagname[@attribute="value"]
					  //*[@id="email"]
				
			Multiple attribute xPath: Example--> //a[@id="id1"][@name="value1"]
			
				And and OR in xPath
				AND--> //*[@type="submit" AND @name="btnLogin"]  ---> both the conditions should be true to find the element.
				OR--> //*[@type="submit" OR @name="btnLogin"]  ---> either of the condition should be true to find the element.
		
		xPath for link: Example--> //a[@href="https://www.google.com"]
		xPath for image: Example--> //img[@alt="sometext"]
		
		xPath Methods: we can handle elements whose properties are changing dynamically.
		1) contains() : //tagname[contains(@attribute,"value")]   Example: //input[contains(@id,"email")]--> matches email123, email111, femail, abcemail etc.
		2) starts-with() : //tagname[starts-with(@attribute,"value")]   Example: //input[starts-with(@name,"submit")]--> matches submit001, submit002, submit003
		
		
*/


package selenium.Webdriver.BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.firefox.marionette", "C:\\SeleniumWebdrivers\\geckodriver-v0.30.0-win64");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		
		//FirefoxDriver driver = new FirefoxDriver();	//invoke the browser
		
		WebDriver driver = new ChromeDriver();	//invoke the browser
		//Thread.sleep(46000);
		
		//driver.get("http://advantageonlineshopping.com/#/");
		//driver.findElement(By.id("menuUserSVGPath")).click();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		
		// trainingsheetal@gmail.com
		// password= andamans143
		
	/*	driver.findElement(By.id("email_create")).sendKeys("trainingsheetal@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		driver.findElement(By.id("id_gender2")).click();
		*/
		
		driver.findElement(By.name("email")).sendKeys("trainingsheetal@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("andamans143");
		driver.findElement(By.name("SubmitLogin")).click();
		
		// To find title of the page--> right click on the page--> select view page source
		
		String expTitle = "My account - My Store";
		String actTitle = driver.getTitle();
		
		//Validation
		if (expTitle.equals(actTitle))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		driver.close();
		
		
		
		// https://goo.gl/kNZ6Sr
		// https://www.formsite.com/templates/human-resources/employment-application-form/
	}

}

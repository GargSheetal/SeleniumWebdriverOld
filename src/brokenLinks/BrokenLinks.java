package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		//Wait
		Thread.sleep(5000);
		
		// capture links from a webpage
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		// Number of links
		System.out.println(links.size());
		
		for(int i=0; i< links.size(); i++)
		{
			// by using href attribute we can get URL of required link
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			
			//create a connection using url object link
			HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();
			
			// Wait for 2 sec
			Thread.sleep(2000);
			
			// establish connection
			httpconn.connect();
			
			int resCode = httpconn.getResponseCode(); // returns response code. if res code is greater tha 400--> broken link
			
			if(resCode>=400)
			{
				System.out.println(url + " - " + "is a broken link");
			}
			else
			{
				System.out.println(url + " - " + "is a valid link");
			}			
			
		}
		
		 
	/*	String underConsTitle = "Under Construction: Mercury Tours"; 
	    List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
        String[] linkTexts = new String[linkElements.size()];							
			int					i = 0;					

			//extract the link texts of each link element		
			for (WebElement e : linkElements) {							
			linkTexts[i] = e.getText();							
			i++;			
        }		

			//test each link		
			for (String t : linkTexts) {							
			driver.findElement(By.linkText(t)).click();					
			if (driver.getTitle().equals(underConsTitle)) {							
                System.out.println("\"" + t + "\""								
                        + " is under construction.");			
            } else {			
                System.out.println("\"" + t + "\""								
                        + " is working.");			
            }		
			driver.navigate().back();			
        }		
			driver.quit();			
		 */
		

	}

}

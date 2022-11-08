package cookiesHandling;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Set <Cookie> cookies = driver.manage().getCookies(); 	// capture all the cookies from the browser
		
		System.out.println("Number of cookies are: " + cookies.size());	// print the size/number of cookies
		
		//Printing cookie name and their value
	/*	for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName() + "---" + cookie.getValue());	// print name and value of cookies
		}	*/
		
		// Printing specific cookie
		//System.out.println(driver.manage().getCookieNamed("session-id-time")); 	// prints specific cookie according to the specified name

		// adding new cookie to the browser
		Cookie cookieObj = new Cookie("MyCookie", "1234567890");
		driver.manage().addCookie(cookieObj);	// add new cookie to the browser
		
		cookies = driver.manage().getCookies();
		
		System.out.println("Number of cookies after adding new cookie are: " + cookies.size());
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName() + "---" + cookie.getValue());	// print name and value of cookies
		}
		
		// deleting cookie
		//driver.manage().deleteCookieNamed("MyCookie");
		driver.manage().deleteCookie(cookieObj);
		
		cookies = driver.manage().getCookies();
		System.out.println("Number of cookies after deleting specified cookie are: " + cookies.size());
		
		// deleting all cookies
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("Number of cookies after deleting all cookies is: " + cookies.size());
		
		driver.close();
	}

}

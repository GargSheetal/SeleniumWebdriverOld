package selenium.Webdriver.BasicTests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fs25.formsite.com/KAHtTf/jp2mqxsj9a/index.html?1636477903684");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"q22\"]/label")).click();	
		
		// Attaching exe file generated by autoIT
		Runtime.getRuntime().exec("C:\\Users\\mgupt\\Desktop\\FileUploadAutoIT.exe");	// execute AutoIT exe file
		
		
	}

}

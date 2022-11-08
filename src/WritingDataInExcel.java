

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingDataInExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Sheetal\\QA_training\\DataCreationViaSelenium.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		for(int i=0; i<=5; i++)
		{
			XSSFRow row = sheet.createRow(i);
			
			for(int j=0; j<=3; j++)
			{
				row.createCell(j).setCellValue("xyz");
			}	
			
		}
		
		workbook.write(file);
		file.close();
		
		System.out.println("Writing data in excel sheet is completed");
		
	}

}

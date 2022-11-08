package dataDrivenTests;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class WrtingDataInExcel2 {

	public static void main(String[] args) throws IOException {
		
FileOutputStream file = new FileOutputStream("C:\\Sheetal\\QA_training\\DataCreationViaSelenium2.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("Dataset1");
		XSSFSheet sheet2 = workbook.createSheet("Dataset2");
		
		for(int i=0; i<=5; i++)
		{
			XSSFRow row1 = sheet1.createRow(i);
			XSSFRow row2 = sheet2.createRow(i);
			
			for(int j=0; j<=3; j++)
			{
				row1.createCell(j).setCellValue("xyz");
				row2.createCell(j).setCellValue("abc");
			}		
			
		}
		
		workbook.write(file);
		file.close();
		
		System.out.println("Writing data in excel sheet is completed");


	}

}

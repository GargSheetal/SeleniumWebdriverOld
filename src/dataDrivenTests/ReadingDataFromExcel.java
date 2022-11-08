package dataDrivenTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream("C:\\Sheetal\\QA_training\\DataDrivenTestingSelenium.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
	//	XSSFSheet sheet=workbook.getSheet("Sheet1"); // providing sheet name
		XSSFSheet sheet=workbook.getSheetAt(0); // providing sheet index
		
		int rowCount=sheet.getLastRowNum();	// returns the row count
		int colCount=sheet.getRow(0).getLastCellNum();	// returns the column/cell count
		
		for(int i=0; i<rowCount; i++)
		{
			XSSFRow currentRow=sheet.getRow(i);	// focus on current row
			
			for(int j=0; j<colCount; j++)
			{
				String cellValue=currentRow.getCell(j).toString();	// read the value from the current cell
				System.out.print(cellValue + "   ");
			}
			
			System.out.println();
		}

	}

}

package FourteenthAprilSampleproject.FourteenthAprilSampleproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {

	
	public void readFromXl(String filePath,String fileName,String sheetName) throws IOException
	{
		
		//Create an object of File class to open xlsx file
		
		File file = new File(filePath+"\\"+fileName);
		System.out.println("test file "+file);
		FileInputStream fis = new FileInputStream(file);
		Workbook xlworkbook = null;
		
		//xlworkbook = new XSSFWorkbook(fis);
		
		System.out.println("test sample");

		org.apache.poi.ss.usermodel.Sheet xlworkbookSheet = xlworkbook.getSheet(sheetName);
		
		int rowcount = xlworkbookSheet.getLastRowNum() - xlworkbookSheet.getFirstRowNum();
		System.out.println("toroal rows "+rowcount);
		
		for (int i=0;i<rowcount; i++)
		{
			Row row = xlworkbookSheet.getRow(i);
			
			for (int j=0;j < row.getLastCellNum();j++ )
			{
				System.out.println("xl values are "+row.getCell(j).getStringCellValue());
				
				
			}
			System.out.println();
			
		}
		
		
		
		
	}
	
}

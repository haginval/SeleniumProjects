package Utilities;

import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

		static XSSFWorkbook workbook ;
		static XSSFSheet sheet;
		
		public ReadExcel(String exelPath, String sheetName) 
		{
			
			 try {
				workbook = new XSSFWorkbook(exelPath);
				 sheet = workbook.getSheet(sheetName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	
	
	public static int getrowCount() throws IOException
	{
		int rowcount = sheet.getPhysicalNumberOfRows();
		//System.out.println("rowcount "+rowcount);
		return rowcount;
		
		
	}
	
	public static int getColumnCount()
	{
		int columnCount =sheet.getRow(1).getLastCellNum();
		//System.out.println("column count is " +columnCount);
		return columnCount;
	}
	
	public static String getCellData(int rownum,int columnnum)
	{
		DataFormatter dataformat = new DataFormatter();
		String cellvalue = dataformat.formatCellValue(sheet.getRow(rownum).getCell(columnnum));
		System.out.println("cell value is "+ cellvalue);
		return cellvalue;
	}


}

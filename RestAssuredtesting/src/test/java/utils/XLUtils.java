package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	
	static XSSFWorkbook workbook ;
	static XSSFSheet sheet;
	
	public XLUtils(String exelPath, String sheetName) throws IOException
	{
		
		 workbook = new XSSFWorkbook(exelPath);
		 sheet = workbook.getSheet(sheetName);
	}
	
	
	public static Object getCellData(int rownum,int columnnum)
	{
		DataFormatter dataformat = new DataFormatter();
		Object cellvalue = dataformat.formatCellValue(sheet.getRow(rownum).getCell(columnnum));
		//System.out.println("cell value is "+ cellvalue);
		return cellvalue;
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
	
	public static void getExcelData() throws IOException
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("project path "+projectPath);
		String excelpath = projectPath+ "./Data/TestData.xlsx";
		System.out.println("excelpath is "+excelpath);
		XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
	}

}


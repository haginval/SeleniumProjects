package utils;

import java.io.IOException;

public class ExcelutilTest {
	
	public static void main(String[] args) throws IOException {
		
		String xlpath =  "./Data/TestData.xlsx";
		String sheetName = "sheet1";
		XLUtils xl = new XLUtils(xlpath,sheetName);
		int rows = xl.getrowCount();
		System.out.println("row count is "+rows);
		int columns = xl.getColumnCount();
		System.out.println("Column count is "+columns);
		for (int i=1;i<=rows-1;i++)
		{
			for (int j=0;j<columns;j++)
			{
				Object o = xl.getCellData(i, j);
				System.out.println("Cell value is " +o);
			}
		}
		
		
		
		
		
		
	}

}

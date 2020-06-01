package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.CreateCustomerPage;
import Pages.LogoutPage;
import Utilities.ReadExcel;

public class CreateCustomersTest extends Base {
//	String cname ="Customer Name1";
//	String dobD = "25";
//	String dobM = "07";
//	String dobY = "1979";
//	String address ="Address 1";
//	String city ="City1";
//	String state ="State1";
//	String pin ="123456";
//	String tph ="1234567891";
//	String email ="user1@htm.com";
	
	
	
	@Test(dataProvider="customerData")
	public void createcustomer(String cname, String dobD, String dobM, String dobY, String address, String city, String state, String pin, 
								String tph,	String email)
	{
		loginStep();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement CreateUser = driver.findElement(By.xpath("//a[contains(text(),'New Customer')]"));
		CreateUser.click();
		CreateCustomerPage cc = new CreateCustomerPage(driver);
		cc.getNewCustomerName().sendKeys(cname);
		cc.getGenderFemale().click();
		cc.getDob().sendKeys(dobD);
		cc.getDob().sendKeys(dobM);
		cc.getDob().sendKeys(dobY);
		cc.getAddress().sendKeys(address);
		cc.getCiti().sendKeys(city);
		cc.getState().sendKeys(state);
		cc.getPin().sendKeys(pin);
		cc.getTnum().sendKeys(tph);
		cc.getEmail().sendKeys(email);
		//CreateUser.click();
		
		LogoutPage lop = new LogoutPage(driver);
		lop.getlogout().click();
		driver.switchTo().alert().accept();
	}
	
	
	
	
	
	
	@DataProvider(name="customerData")
	String [][] getData() throws IOException
	{
		String path = "C:/Users/raghu/eclipse-workspace/AutoGuruProjectSample/TestData/createCustomer.xlsx";
		ReadExcel rxl = new ReadExcel(path,"sheet1");
		
		int rcount = rxl.getrowCount();
		System.out.println("row count " +rcount);
		int ccount = rxl.getColumnCount();
		System.out.println("column count " +ccount);
		String newcustomer [] [] = new String [rcount-1] [ccount];
		
		for (int i= 1; i<rcount;i++)
		{
			for (int j=0;j<ccount;j++)
			{
				newcustomer[i-1][j] =(String) rxl.getCellData(i,j);
			}
			//return newcustomer;
		}
		
		return newcustomer;
				
		
		
		
	}
	
}

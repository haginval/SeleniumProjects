package Test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FourteenthAprilSampleproject.FourteenthAprilSampleproject.Base;
import FourteenthAprilSampleproject.FourteenthAprilSampleproject.ReadExcel;
import Pages.LoginPage;

public class LoginPageTest extends Base {
	
	
	@BeforeTest
	public void init() throws IOException
	{
		driver = setup();
	}
	
	@Test
	public void login()
	{
		driver.get("https://www.saucedemo.com/");
		LoginPage lp = new LoginPage(driver);
		lp.getUserName().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getLoginButton().click();
		driver.close();
	}
	
	
	
	/*@Test
	public void callexcel() throws IOException
	{
		ReadExcel rxl = new ReadExcel();
		//String filepath = "C:\\Users\\raghu\\OneDrive\\Desktop\\Raghu\\";
		String filepath = "C:\\Users\\raghu\\eclipse-workspace\\FourteenthAprilSampleproject\\src\\main\\java\\FourteenthAprilSampleproject\\FourteenthAprilSampleproject";
		String fileName ="testdata.xlsx";
		String sheetName = "sheet1";
		rxl.readFromXl(filepath, fileName, sheetName);
				
	}*/
	
	@AfterTest
	public void teardown1()
	{
		driver.quit();
	}

}

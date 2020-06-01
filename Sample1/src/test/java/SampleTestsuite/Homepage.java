package SampleTestsuite;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DemoSample1.Base;
import objectRepo.loginPage;

public class Homepage extends Base {
	
	public static org.apache.logging.log4j.Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initializeDriver() throws IOException
	{
		initialiseDriver();
		log.info("Driver initialised");
	}
			
	@Test(dataProvider= "getdata")
	public void BasePageNavigation(String username,String pwd) throws IOException
	{
		
		driver.get(prop.getProperty("url"));
		loginPage hp = new loginPage(driver);
		hp.getLoginPage().click();
		hp.getUserName().sendKeys(username);
		hp.getpassword().sendKeys(pwd);
		hp.getSubmit().click();
		String msg = hp.invalidUser().getText();
		System.out.println(msg);
		Assert.assertEquals(msg, "Invalid email or password");
		//Assert.assertTrue(hp.invalidUser().isDisplayed());
		
		log.info("Log test");
	}

	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[2][2];
		data[0][0]= "raghuhk@hotmail.com";
		data[0][1]= "fivestar";
		data[1][0]= "raghuhk@hotmail1.com";
		data[1][1]= "fivestar2";
	
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver= null;
	}
	
}


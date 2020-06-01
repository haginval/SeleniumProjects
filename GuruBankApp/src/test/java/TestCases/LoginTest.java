package TestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;


public class LoginTest extends Base {

	
	private static Logger log = LogManager.getLogger(LoginTest.class.getName());
	
	@Test
	public void loginPageTest() throws IOException
	{
		
		//driver.get(baseUrl);
		
		LoginPage lp = new LoginPage(driver);
		lp.getUserId().sendKeys(userName);
		lp.getPassword().sendKeys(password);
		lp.getsubmitButton().submit();
		
		String pageTitle = driver.getTitle();
		System.out.println("pageTitle is" +pageTitle);
		log.info("Guru Bank app");
		log.info("test log info");
		log.error("Error Message");
		log.fatal("fatel message");
		
		if ( pageTitle.equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
		
		
	}
	
}


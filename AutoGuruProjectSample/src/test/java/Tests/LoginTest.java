package Tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;
import junit.framework.Assert;

public class LoginTest extends Base {
	//WebDriver driver;
	
@Test	
public void loginPagetest()
{
//	LoginPage lp = new LoginPage(driver);
//	lp.getUserName().sendKeys(username);
//	lp.getPassword().sendKeys(password);
//	lp.getSubmitButton().submit();
	
	Logger logs = LogManager.getLogger(LoginTest.class.getName());
	
	logs.info("Login page test cases starting");
	loginStep();
	String pageTitle = driver.getTitle();
	System.out.println("Page tile is " +pageTitle);
	logs.info("validating the page Title");
	
	if (pageTitle.contentEquals("GTPL Bank Manager HomePage "))
	{
		logs.info("PageTitle verification passed");
	}
	else
	{
		logs.error("Page title failed");
	}
	
	Assert.assertEquals("GTPL Bank Manager HomePage", pageTitle);
	
	
}

}

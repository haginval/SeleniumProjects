package Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Pages.Base;
import Pages.RediffHome;
import Pages.RediffMoney;

public class RediffMoneyPagetest extends Base {
	
	/*By moneyLink = By.xpath("//a[@class='moneyicon relative']");
	By searchbox = By.xpath("//*[@id='srchword']");
	By redifflink = By.xpath("//a[contains(text(),'rediff.com')]");*/
							

	@BeforeTest
	public void initialise()
	{
		setup();
	}

	
	@Test(priority = 0)
	public void navigation()
	{
		RediffHome rho = new RediffHome(driver);
		rho.RediffHomelink().click();
	}
	
	@Test(priority = 1)
	public void rediffMoneypagetest() throws IOException
	{
		RediffMoney rms = new RediffMoney(driver);
		rms.searchtext().sendKeys("State Bank of India");
		rms.getSearchbutton().submit();
		rms.redifflinktext().click();
		
		extreport();
		
		//ExtentReport ext = new ExtentReport();
		ExtentTest test = extent.createTest("ExtentReportDemo");
		// log(Status, details)
	    test.log(Status.INFO, "test case to get SBI Quote Date");

	    // info(details)
	    test.info("Inside RediffMoney Page Test)");
	    
	    // log with snapshot
	    //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
				
	    extent.flush();
	}

	/*@AfterTest
	public void tearDown()
	{
		// calling flush writes everything to the log file
	    extent.flush();
	}*/
	

}
package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Base;
import Pages.RediffHome;

public class RediffHomepageTest extends Base{
	
	@BeforeTest
	public void initialise()
	{
		setup();
	}
	
	
	@Test
	public void navigation()
	{
		RediffHome rho = new RediffHome(driver);
		rho.RediffHomelink().click();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

	
	
}

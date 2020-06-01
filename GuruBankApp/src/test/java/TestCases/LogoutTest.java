package TestCases;

import org.testng.annotations.Test;

import PageObjects.LogoutPage;

public class LogoutTest extends Base {

	
	@Test
	public void logouttest()
	{
				LogoutPage lop = new LogoutPage(driver);
		lop.getlogout().click();
	}
}

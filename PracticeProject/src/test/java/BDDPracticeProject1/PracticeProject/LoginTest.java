package BDDPracticeProject1.PracticeProject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectDefinition.LoginPage;
import ObjectDefinition.createnewAccount;



public class LoginTest extends Base{

	@BeforeTest
	public void iniBrowser() throws IOException
	{
		driverInitialise();
	}

	@Test
	public void navigate() throws InterruptedException
	{
		driver.get(url);
		LoginPage lp = new LoginPage(driver);
		lp.getMailIcon().click();
		lp.getNewAccountLink().click();
		//driver.wait(10);
		//createnewAccount na = new createnewAccount(driver);
		String page = driver.getTitle();
		System.out.println("page is " +page);
		//na.getfullName().sendKeys("asdasd");
		System.out.println("end of first test");
	}
	
	/* @Test
	public void zaccountDetail()
	{
		//driver.get("http://rediffmail.com");
		System.out.println("Test2 page is ");
		createnewAccount na = new createnewAccount(driver);
		System.out.println("Test2 page is 2");
		String page = driver.getTitle();
		System.out.println("Test2 page is " +page);
		na.getfullName().sendKeys("asdasd");
		na.getChooseId().sendKeys("asd");	
		na.getPassword().sendKeys("asda213");
		na.getReWritepwd().sendKeys("asda213");
		na.getMobileNum().sendKeys("9823428");
	} */
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver.quit();
	}
	
}

package BDDPracticeProject1.PracticeProject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ObjectDefinition.LoginPage;
import ObjectDefinition.createnewAccount;

public class CreateNewAccountTests extends Base {
	
	@BeforeTest
	public void initialiseDriver() throws IOException
	{
		driverInitialise();
	}
	
	@Test(dataProvider="getData")
	public void createAccount(String name,String id,String pwd,String cpwd,String mobi) throws InterruptedException
	{
		System.out.println("url is " +url);
		driver.get(url);
		LoginPage l = new LoginPage(driver);
		l.getMailIcon().click();
		//driver.wait(5);
		l.getNewAccountLink().click();	
		//driver.wait(5);
		//driver.manage().wait(5);
		createnewAccount cna = new createnewAccount(driver);
		cna.getfullName().sendKeys(name);
		System.out.println("name is " +name);
		cna.getChooseId().sendKeys(id);	
		System.out.println("id is " +id);
		cna.getPassword().sendKeys(pwd);
		System.out.println("pwd is " +pwd);
		cna.getReWritepwd().sendKeys(cpwd);
		System.out.println("cpwd is " +cpwd);
		cna.getMobileNum().sendKeys(mobi);
		System.out.println("mobile is " +mobi);
	}
	
	
	//
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][5];
		data[0][0] = "namefirst last";
		data[0][1] = "krish";
		data[0][2] = "asd";
		data[0][3] = "sdasdas";
		data[0][4] = "123123";
		
		data[1][0] = "namefist lastasd";
		data[1][1] = "krishasd";
		data[1][2] = "asdaa";
		data[1][3] = "sdasdastwo";
		data[1][4] = "1231232two";
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver.quit();
	}

}

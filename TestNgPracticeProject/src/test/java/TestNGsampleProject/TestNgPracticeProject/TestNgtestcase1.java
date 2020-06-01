package TestNGsampleProject.TestNgPracticeProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgtestcase1 {

	@BeforeTest
	public void browserinitilse()
	{
		System.out.println("Browser initialisation method");
		System.out.println("code to initilise the driver is called");
			
		}
	@Test(priority = 2)
	public void testcase1()
	{
		System.out.println("code for test case1");
	}
	
	@Test(priority = 0)
	public void testcase2()
	{
		System.out.println("code for test case2");
	}
	
	@Test(groups = {"smoke"})
	public void testcase3()
	{
		System.out.println("code for test case3");
	}
	
	@Test(groups = {"smoke"})
	public void testcase4()
	{
		System.out.println("code for test case4");
	}
	
	@BeforeMethod
	public void beforeMethodtest()
	{
		System.out.println("code for before method test");
	}
	
	@AfterMethod
	public void afterMethodtest()
	{
		System.out.println("code for after method test");
	}
	
	@AfterTest
	public void teardown()
	{
		System.out.println("tear down script to close and quit driver");
	}
}

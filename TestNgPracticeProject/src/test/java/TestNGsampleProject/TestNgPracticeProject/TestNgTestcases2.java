package TestNGsampleProject.TestNgPracticeProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgTestcases2 {
	
	
	@BeforeTest
	public void initialiseDriver()
	{
		System.out.println("code to initialise driver");
	}

	@Test(groups = {"smoke"})
	public void TestcaseA1()
	{
		System.out.println("code Test caseA1");
	}
	
	@Test(groups = {"smoke"})
	public void TestcaseA2()
	{
		System.out.println("code Test caseA2");
	}
	
	@AfterTest
	public void TestcaseA3()
	{
		System.out.println("code to close and quit browser from testcseset2");
	}
}


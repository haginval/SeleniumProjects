package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base {

	public WebDriver driver;
	
	public String url = "http://rediff.com";
	
	public WebDriver setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get(url);
		return driver;
		
	}
	
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	
	public  void extreport()
	{
				
		htmlreporter = new ExtentHtmlReporter("extent.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		//ExtentTest test = extent.createTest("ExtentReportDemo");
		// log(Status, details)
	    //test.log(Status.INFO, "This step shows usage of log(status, details)");

	    // info(details)
	    //test.info("This step shows usage of info(details)");
	    //return test;
	    // log with snapshot
	   // test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	    
	    // test with snapshot
	   // test.addScreenCaptureFromPath("screenshot.png");
	    
	}
}

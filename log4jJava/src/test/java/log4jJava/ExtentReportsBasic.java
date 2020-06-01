package log4jJava;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        
        //test.log("Test Pass", "Test case1 pass");
        test.log(Status.INFO, "Test case started");
        test.log(Status.ERROR, "Error message");
        test.log(Status.FATAL, "Fatal message ");
        extent.flush();
        
		
	}

}

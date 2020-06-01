package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		try
		{
					
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0 NRD90M");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi raghu");
	cap.setCapability(MobileCapabilityType.UDID,"7a10c6dc9904");
	//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	//automationName=UiAutomator1
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60000);
	cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AppiumDriver<MobileElement>(url,cap);
	
	}catch (Exception exp){
		
	System.out.println("cause is "+exp.getCause());
	}
}
	
	@Test
	public void sampletest()
	{
		System.out.println("inside test");
	}
	
	@AfterTest
	public void teardown()
	{
		
	}
}

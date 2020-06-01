package ApplicationUnderTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
	
	public  WebDriver initialiseDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\raghu\\eclipse-workspace\\MyArtifactGroup\\src\\main\\java\\ApplicationUnderTest\\Data");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if (browserName == "Chrome")
		{
			System.out.println("Chrome driver initialization");
			System.setProperty("webdriver.chrome.driver","c://user//raghu//chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}

}

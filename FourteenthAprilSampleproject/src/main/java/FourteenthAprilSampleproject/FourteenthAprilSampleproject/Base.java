package FourteenthAprilSampleproject.FourteenthAprilSampleproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	
	public Properties prop;
	
	
	
	public WebDriver setup() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\raghu\\eclipse-workspace\\FourteenthAprilSampleproject\\src\\main\\java\\FourteenthAprilSampleproject\\FourteenthAprilSampleproject\\data.properties");
		
		prop.load(fis);
		String browser = prop.getProperty("Browser");
		System.out.println("Selected Browser " +browser);
		
		if (browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghu\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.get("https://www.saucedemo.com/");
			
		}
		
		return driver;
		
	}
	
	
	
	
	
}

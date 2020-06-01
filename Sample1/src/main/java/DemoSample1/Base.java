package DemoSample1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	//private WebDriver driver;
	public WebDriver driver;
	//public Properties prop = new Properties();
	public Properties prop;
	public String urls;
	
	
	
	public WebDriver initialiseDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\raghu\\eclipse-workspace\\Sample1\\src\\main\\java\\DemoSample1\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		urls=prop.getProperty("url");
		System.out.println(browserName);
		System.out.println("in Initialise Driver"+ urls);
		
		if (browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\raghu\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//setDriver(new ChromeDriver());
			driver = new ChromeDriver();
		}
				
				
				//return getDriver();
		return driver;
		
	}
}
	/*public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}*/

		

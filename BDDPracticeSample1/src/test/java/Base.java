
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pages.LoginPage;
import Utilities.ReadConfig;

public class Base {
	
	WebDriver driver;
	ReadConfig readconfigFile = new ReadConfig();
	
	String browser = readconfigFile.getBrowser();
	String appurl = readconfigFile.getApplicationurl();
	String username = readconfigFile.getUserName();
	String password = readconfigFile.getpassword();
	
	
	@BeforeClass
	public void setup()
	{
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", readconfigFile.getChromePath());
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appurl);
	}
	
	
	public void loginStep()
	{
		LoginPage lp = new LoginPage(driver);
		lp.getUserName().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getSubmitButton().submit();
		driver.manage().window().maximize();
}

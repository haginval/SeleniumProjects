package BDDPracticeProject1.BDDPracticeSample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	String browser="Chrome";
	public WebDriver initialiseDriver()
	{
		if (browser=="Chrome")
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghu\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		return driver;
	}

}

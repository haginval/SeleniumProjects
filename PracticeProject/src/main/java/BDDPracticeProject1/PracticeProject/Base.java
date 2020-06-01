package BDDPracticeProject1.PracticeProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
	public Properties prop;
	public String url;
	//prop = new Properties();
	String Fl = "C:\\Users\\raghu\\eclipse-workspace\\PracticeProject\\src\\main\\java\\data.properties";
	//public String url = "http:\\rediff.com";
		
	public WebDriver driverInitialise() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(Fl);
		prop.load(fis);		
		String browserName = prop.getProperty("browser");
		System.out.println("Selected Browser "+browserName);
		 url = prop.getProperty("url");
		System.out.println("Selected url "+url);
		//String F2 = "skjdh";
		String dirloc = System.getProperty("user.dir");
		System.out.println("Project dir location " + dirloc);
		//System.out.println(System.getProperty("user.dir"));
		String Chromepath = dirloc +"\\chromedriver.exe";
		System.out.println(Chromepath);
				//"C:\\Users\\raghu\\Downloads\\chromedriver_win32\\chromedriver.exe"
		if (browserName.contentEquals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",Chromepath);
			 driver = new ChromeDriver();
		}
		return driver;
	}
	

}

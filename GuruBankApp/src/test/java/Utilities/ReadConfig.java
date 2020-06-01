package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	 Properties prop;
	
	public ReadConfig()
	{
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}catch (Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	}

	public String getApplicationUrl()
	{
		String url = prop.getProperty("baseUrl");
		return url;
	}
	
	public String getUserName()
	{
		String username = prop.getProperty("userName");
		return username;
	}
	
	public String getPassword()
	{
		String pwd = prop.getProperty("Password");
		return pwd;
	}
	
	public String getChromePath()
	{
	String chromepath=prop.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=prop.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=prop.getProperty("firefoxpath");
	return firefoxpath;
	}
	
}
	
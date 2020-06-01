package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	By userId = By.xpath("//input[@name='uid']");
	By pwd = By.xpath("//input[@name='password']");
	By submit = By.xpath("//input[@name='btnLogin']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getUserName()
	{
		return driver.findElement(userId);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(pwd);
	}
	
	public WebElement getSubmitButton()
	{
		return driver.findElement(submit);
	}
}

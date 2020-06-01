package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;

	By userName = By.xpath("//input[@id='user-name']");
	By pwd = By.xpath("//input[@id='password']");
	By submitButton = By.xpath("//input[@class='btn_action']");
	


public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver = driver;
	}

public WebElement getUserName()
{
	return driver.findElement(userName);
}

public WebElement getPassword()
{
	return driver.findElement(pwd);
}

public WebElement getLoginButton()
{
	return driver.findElement(submitButton);
}



}
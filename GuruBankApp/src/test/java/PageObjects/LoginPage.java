package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	By userId = By.xpath("//input[@name='uid']");
	By pwd = By.xpath("//input[@name='password']");
	By submit = By.xpath("//input[@name='btnLogin']");
	
		
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getUserId() {
		return driver.findElement(userId);
	
	}
	
	public WebElement getPassword() {
		return driver.findElement(pwd);
		
	}
	
	public WebElement getsubmitButton() {
		return driver.findElement(submit);
		
	}

}

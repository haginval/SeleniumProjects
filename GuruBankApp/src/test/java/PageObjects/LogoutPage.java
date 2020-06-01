package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

	WebDriver driver;
	By logout = By.xpath("//a[contains(text(),'Log out')]");
	
	
public LogoutPage(WebDriver driver) {
		
		this.driver = driver;
	}


public WebElement getlogout()
{
	return driver.findElement(logout);
}

}
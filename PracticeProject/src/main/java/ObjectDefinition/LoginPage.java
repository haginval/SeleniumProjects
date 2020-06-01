package ObjectDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	public WebDriver driver;
	
	By mailIcon = By.xpath("/html/body/div[2]/div/div[2]/a[1]");
	By newAccountLink = By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[2]/div/a/u");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getMailIcon()
	{
	return driver.findElement(mailIcon);
	}
	
	public WebElement getNewAccountLink()
	{
		return driver.findElement(newAccountLink);
	}
}


package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public WebDriver driver;
	
	By homeLink = By.xpath("//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a/span");
	
	By email = By.xpath("//*[@id=\'user_email\']");
	
	By pwd = By.id("user_password");
	
	By submit = By.xpath("//*[@id=\'new_user']/div[3]/input");
	
	By InvaliduserMsg = By.xpath("/html/body/div/div/div/div/div/div/div[1]/div/div");
	
	public loginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getLoginPage()
	{
	return driver.findElement(homeLink);
	}
	
	public WebElement getUserName()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(pwd);
	}
	
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	
	

public WebElement invalidUser()
{
	return driver.findElement(InvaliduserMsg);
}

}

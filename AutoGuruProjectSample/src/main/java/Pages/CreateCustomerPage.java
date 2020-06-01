package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateCustomerPage {
	
	WebDriver driver;
	By newCustomerName = By.xpath("//input[@name='name']");
	By genderMale = By.xpath("//tr[5]//td[2]//input[1]");
	By genderFemale = By.xpath("//tr[5]//td[2]//input[2]");
	By dob = By.xpath("//input[@id='dob']");
	By address = By.xpath("//textarea[@name='addr']");
	By citi = By.xpath("//input[@name='city']");
	By state = By.xpath("//input[@name='state']");
	By pin = By.xpath("//input[@name='pinno']");
	By tNum = By.xpath("//input[@name='telephoneno']");
	By eMail = By.xpath("//input[@name='emailid']");
	By submit = By.xpath("//input[@name='sub']");
	By reset = By.xpath("//input[@name='res']");
	
	
	
	public  CreateCustomerPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getNewCustomerName()
	{
		return driver.findElement(newCustomerName);
	}
	
	public WebElement getGenderMale()
	{
		return driver.findElement(genderMale);
	}
	
	public WebElement getGenderFemale()
	{
		return driver.findElement(genderFemale);
	}
	
	public WebElement getDob()
	{
		return driver.findElement(dob);
	}
	
	public WebElement getAddress()
	{
		return driver.findElement(address);
	}
	
	public WebElement getCiti()
	{
		return driver.findElement(citi);
	}
	
	public WebElement getState()
	{
		return driver.findElement(state);
	}
	
	public WebElement getPin()
	{
		return driver.findElement(pin);
	}
	
	public WebElement getTnum()
	{
		return driver.findElement(tNum);
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(eMail);
	}
	
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	
	public WebElement getReset()
	{
		return driver.findElement(reset);
	}
	
	

}

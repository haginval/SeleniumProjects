package ObjectDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createnewAccount {
	
	public WebDriver driver;
	
	By fullName = By.xpath("//*[starts-with(@name,'name')]");
	//By fullName = By.xpath("//input[@name='namede68e53e']");
	//By fullName = By.name("nameed95ae7c");
	//By fullName = By.name("nameaf45c698")
	//named24632a5        	
			//input[@name='namede68e53e']
	By chooseId = By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[7]/td[3]/input[1]");
	By pwd = By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[9]/td[3]/input");
	By rewritePwd = By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input");
	By alterEmail = By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input");
	By mobilenum = By.xpath("//*[@id=\"mobno\"]");
	By createButton = By.xpath("//*[@id=\"Register\"]");
	
	
	public createnewAccount(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver ;
	}

	public WebElement getfullName()
	{
		return driver.findElement(fullName);
	}
	
	public WebElement getChooseId()
	{
		return driver.findElement(chooseId);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(pwd);
	}
	
	public WebElement getReWritepwd()
	{
		return driver.findElement(rewritePwd);
	}

	public WebElement getAlteremail()
	{
		return driver.findElement(alterEmail);
	}
	
	public WebElement getMobileNum()
	{
		return driver.findElement(mobilenum);
	}
	
	public WebElement getCreateButton()
	{
		return driver.findElement(createButton);
	}
}


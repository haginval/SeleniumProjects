package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class RediffMoney {
	
	public WebDriver driver;
	By searchbox = By.xpath("//input[@id='srchword']");
	By searchbutton = By.xpath("//input[@class='msprite btn_srch']");
	By redifflink = By.xpath("//a[contains(text(),'rediff.com')]");
	
	
	
	public RediffMoney(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement searchtext()
	{
		return driver.findElement(searchbox);
	}
	
	public WebElement redifflinktext()
	{
		return driver.findElement(redifflink);
	}
	
	public WebElement getSearchbutton()
	{
		return driver.findElement(searchbutton);
	}

}


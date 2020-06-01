package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHome {
	
	public WebDriver driver;
	By moneyLink = By.xpath("//a[@class='moneyicon relative']");

	
	public RediffHome(WebDriver driver)
	{
		this.driver = driver;
	}


public WebElement RediffHomelink()
{
	return driver.findElement(moneyLink);
}


}
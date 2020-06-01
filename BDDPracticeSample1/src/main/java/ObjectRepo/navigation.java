package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class navigation {

	public WebDriver driver;
	
	public static String url = "http://automationpractice.com/";
	//By WomenCategoryLink = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
	By WomenCategoryLink = By.xpath("//*[@id='block_top_menu']/ul/li[1]/a");
	By TopsSection = By.xpath("//a[@class='sf-with-ul'][contains(text(),'Tops')]");
	                           //a[@class='sf-with-ul'][contains(text(),'Tops')]
	By TopsPageHeader = By.xpath("//*[@id=\"center_column\"]/h1/span[1]");
								//*[@title='Faded Short Sleeve T-shirts'])"
								
	
	


public navigation(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver = driver;
	}

public WebElement womencategory()
{
	return driver.findElement(WomenCategoryLink);
}

public WebElement womenTopsSection()
{
	return driver.findElement(TopsSection);
	
	//Select wts = new Select(driver.findElement(TopsSection));
	//wts.selectByIndex(index);
}

public WebElement TopsPageHeadertext()
{
	return driver.findElement(TopsPageHeader);
}
}
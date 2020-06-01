package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

	public WebDriver driver;
	
	By catDropdown = By.xpath("//select[@class='product_sort_container']");
	//@FindBy(xpath="//select[@class='product_sort_container']")
	//WebElement dropdownList;
	
	public ProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver =driver;
	}

	public void ddm(int index)
	{
		Select ddo =  new Select (driver.findElement(catDropdown));
		
		ddo.selectByIndex(index);
	}
	
	public  int textdisplay(int index)
	{
		System.out.println("INdex+2 = " +(index+2));
		 int i = (index+2);
		 return i;
	}

	
}

package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FourteenthAprilSampleproject.FourteenthAprilSampleproject.Base;
import Pages.LoginPage;
import Pages.ProductPage;


public class ProductPageTest extends Base {
	@BeforeTest
	public void init() throws IOException
	{
		driver = setup();
	}
	
	//LoginPage lp = new LoginPage(driver);
	//ProductPage pp = new ProductPage(driver);
	
	@Test
	public void login()
	{
		driver.get("https://www.saucedemo.com/");
		LoginPage lp = new LoginPage(driver);
		ProductPage pp = new ProductPage(driver);
		lp.getUserName().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getLoginButton().click();
		//Select dropd = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		//dropd.selectByIndex(2);
		//pp.ddm(3);
		//int j = pp.textdisplay(10);
		//System.out.println("value of J " +j);
		pp.ddm(1);
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	}



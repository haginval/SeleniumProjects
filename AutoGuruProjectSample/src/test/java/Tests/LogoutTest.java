package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.LogoutPage;

public class LogoutTest extends Base {
	
	
		@Test
		public void logouttest() throws InterruptedException
		{
			loginStep();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement CreateUser = driver.findElement(By.xpath("//a[contains(text(),'New Customer')]"));
			CreateUser.click();
			
			LogoutPage lop = new LogoutPage(driver);
			lop.getlogout().click();
			driver.switchTo().alert().accept();
			//WebDriverWait wait = new WebDriverWait(driver,20);
			
		}
	}



package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BDDPracticeProject1.BDDPracticeSample1.Base;
import ObjectRepo.navigation;

@RunWith(Cucumber.class)
public class StepdefinitionEkart extends Base   {

   /* @Given("^user is in Women -T-Shirt section$")
    public void user_is_in_womentshirt_section()   throws Throwable {
    	initialiseDriver();
    	System.out.println("inside step definition file");
        
    } */
    
    //----
	//WebDriver driver;
	
	/* public void DriverInitialization()
	{
		driver = initialiseDriver();
    	//System.out.println("inside step definition file");    
    	driver.navigate().to("http://automationpractice.com/");
	}*/
	
	
    
    @Given("^user is in Women-T-Shirt section$")
    public void user_is_in_Women_T_Shirt_section() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
   //navigate.
    	driver = initialiseDriver();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	System.out.println("inside step definition file");    
    	driver.get("http://automationpractice.com/");
    	navigation ng = new navigation(driver);
    	//ng.womencategory().click();
    	//ng.womenTopsSection(1);
    	Actions actions = new Actions(driver);
    	actions.moveToElement(ng.womencategory()).perform();
    	System.out.println("user is in menu seletion step");
    	//driver.manage().wait(3000);
    	ng.womenTopsSection().click();
    	WebElement Element = driver.findElement(By.xpath("//*[@title=\"Faded Short Sleeve T-shirts\"]"));
    	js.executeScript("arguments[0].scrollIntoView();", Element);
    	Element.click();
    								//"a[title=\"Go to Facebook home\"]")).click();					
    }
    //---
    

    @When("^user selects the item and clicks on Add to Kart$")
    public void user_selects_the_item_and_clicks_on_add_to_kart() throws Throwable {
        throw new PendingException();
    }

    @Then("^selected items to be added to the kart$")
    public void selected_items_to_be_added_to_the_kart() throws Throwable {
        throw new PendingException();
    }

}

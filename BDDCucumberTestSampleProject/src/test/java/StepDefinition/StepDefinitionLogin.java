package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



@RunWith(Cucumber.class)
public class StepDefinitionLogin {
	public WebDriver driver;

    @Given("^user is in login page$")
    public void user_is_in_login_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\raghu\\Downloads\\chromedriver_win32\\chromedriver.exe");
 	   driver = new ChromeDriver();
 	   driver.get("http://qaclickacademy.com");
 	    driver.findElement(By.xpath("//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a/span")).click();
    }

    @When("^user enters valid user name as (.+) and valid password as (.+)$")
    public void user_enters_valid_user_name_as_and_valid_password_as(String userName, String passWord) throws Throwable {
    	 driver.findElement(By.xpath("//*[@id=\'user_email\']")).sendKeys(userName);
		    driver.findElement(By.id("user_password")).sendKeys(passWord);
		    driver.findElement(By.xpath("//*[@id=\'new_user']/div[3]/input")).submit();	
    }

    @Then("^user should be able to login and navigate to Home page$")
    public void user_should_be_able_to_login_and_navigate_to_home_page() throws Throwable {
    	System.out.println("Then step validation code executed");
    }

}

package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepdefinition {

    @Given("^User is at login page$")
    public void user_is_at_login_page() throws Throwable {
    	System.out.println("In Given section - User is in Login page");

    }

    @When("^User provides valid user name and passoword$")
    public void user_provides_valid_user_name_and_passoword() throws Throwable {
    	System.out.println("In When section - User gives valid user name and password");
       
    }

    @Then("^User should land in Home page$")
    public void user_should_land_in_home_page() throws Throwable {
    	System.out.println("In Then section - User is in Home page");
       
    }

    @And("^User name is displayed on top$")
    public void user_name_is_displayed_on_top() throws Throwable {
    	System.out.println("In And section - User Name is displayed");
       
    }

}
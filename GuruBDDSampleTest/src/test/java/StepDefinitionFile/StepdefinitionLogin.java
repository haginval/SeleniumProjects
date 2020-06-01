package StepDefinitionFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefinitionLogin {

	@Given("^When user is in login page$")
	public void when_user_is_in_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("INside Given method");
	}

	@When("^user enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("INside When method");
	}

	@Then("^home page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("INside Then method");
	}

	
}

package cucumberadapter4.adrianarg.StepDefinitions;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutPageSteps {
	@Given("^an authenticated user$")
	public void an_authenticated_user() {
		System.out.println("PASSED step: an authenticated user");
		Assert.assertTrue(true,"FAILED Step: an authenticated user");
	}

	@When("selects a product")
	public void selects_a_product() {
		System.out.println("PASSED step: selects a product");
		Assert.assertTrue(true, "FAILED Step: selects a product");
	}

	@Then("the checkout page is displayed")
	public void the_checkout_page_is_displayed() {
		System.out.println("PASSED step: the checkout page is displayed");
		Assert.assertTrue(true,  "FAILED Step: the checkout page is displayed");
	}

	@Given("^an authenticated user using (?:[\\\"'])(.*)(?:[\\\"'])$")
	public void an_authenticated_user_using_another_user_com(String user ) {
		Assert.assertTrue(false,"FAILED Step: an authenticated user using" + user);
	}

}

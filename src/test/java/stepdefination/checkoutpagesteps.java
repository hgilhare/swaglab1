package stepdefination;

import java.io.IOException;

import io.cucumber.java.en.Then;
import page.checkoutpage;

public class checkoutpagesteps {

	checkoutpage ch = new checkoutpage();

	@Then("user click on add to cart button")
	public void user_click_on_add_to_cart_button() {
		ch.user_click_on_add_to_cart_button();
	}

	@Then("validating add to cart icon")
	public void validating_add_to_cart_icon() throws IOException {
		ch.validating_add_to_cart_icon();

	}

	@Then("user click on cart icon")
	public void user_click_on_cart_icon() {
		ch.user_click_on_cart_icon();

	}

	@Then("user click on checkout button")
	public void user_click_on_checkout_button() {
		ch.user_click_on_checkout_button();
	}

	@Then("user enter info {string} {string} {string}")
	public void user_enter_info(String fname, String lname, String pcode) {
		ch.user_enter_info(fname, lname, pcode);

	}

	@Then("user click on continue button")
	public void user_click_on_continue_button() {
		ch.user_click_on_continue_button();

	}

	@Then("user validate checkout overview")
	public void user_validate_checkout_overview() {
		ch.user_validate_checkout_overview();
	}

	@Then("user click on finish button")
	public void user_click_on_finish_button() {
		ch.user_click_on_finish_button();

	}

	@Then("user validate thank you message")
	public void user_validate_thank_you_message() {
		ch.user_validate_thank_you_message();
	}

	@Then("validate error message")
	public void validate_error_message() throws IOException {
		ch.validate_error_message();
	
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
		ch.user_close_the_browser();

	}

	@Then("user click on remove button")
	public void user_click_on_remove_button() {
		ch.user_click_on_remove_button();
		
	}

	@Then("user validating succesful removal of product")
	public void user_validating_succesful_removal_of_product() {
	ch.user_validating_succesful_removal_of_product();	
	}

}

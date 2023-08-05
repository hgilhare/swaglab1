package stepdefination;

import helper.base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.loginpage;;

public class loginPageSteps  {

	loginpage a = new loginpage();
	


	@Given("user enter username and password")
	public void user_enter_username_and_password() {
		a.user_enter_username_and_password();

	}

	@Given("user click on login button")
	public void user_click_on_login_button() {
		a.user_click_on_login_button();
	}

	@Then("login validate succesfully")
	public void login_validate_succesfully() {
		a.login_validate_succesfully();
		

	}

}

package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.homepage;

public class homepagesteps {
	
	homepage p = new homepage();
	@Given("user click on filter")
	public void user_click_on_filter() {
		p.user_click_on_filter();
		
	    
	}

	@Then("user select Z to A")
	public void user_select_z_to_a() {
p.user_select_z_to_a();
	}

	@Then("user validating filter")
	public void user_validating_filter() {
		p.user_validating_filter();
	   
	}
	@Then("user select select low to high")
	public void user_select_select_low_to_high() {
		p.user_select_select_low_to_high();
	
	}

	@Then("user validating filter low to high")
	public void user_validating_filter_low_to_high() {
		p.user_validating_filter_low_to_high();
	  
	}
	@Then("user select select high to low")
	public void user_select_select_high_to_low() {
		p.user_select_select_high_to_low();
	    
	}

	@Then("user validating filter high to low")
	public void user_validating_filter_high_to_low() {
		p.user_validating_filter_high_to_low();
	    
	}
	@Then("user click on three horizontal bar")
	public void user_click_on_three_horizontal_bar() {
	    
	}

	@Then("user click on logout button")
	public void user_click_on_logout_button() {
	    ;
	}

	@Then("user validating logout succesful")
	public void user_validating_logout_succesful() {

	}

}

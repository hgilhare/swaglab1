package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class homepage extends base {

	public By filtertbn = By.cssSelector("select.product_sort_container");
	public By threebar= By.cssSelector("button#react-burger-menu-btn");
	public By logoutbtn= By.cssSelector("a#logout_sidebar_link");

	public void user_click_on_filter() {

		clickbyexecutor(filtertbn);

	}

	public void user_select_z_to_a() {

		selectbyvisibletext(filtertbn, "Name (Z to A)");
	}

	public void user_validating_filter() {

		WebElement drpdwnbtn = driver.findElement(By.cssSelector("[value='za']"));
		String text = drpdwnbtn.getText();

		Assert.assertEquals("Name (Z to A)", text);

	}

	public void user_select_select_low_to_high() {

		selectbyvisibletext(filtertbn, "Price (low to high)");
	}

	public void user_validating_filter_low_to_high() {

		Assert.assertTrue(driver.findElement(By.cssSelector("[value='lohi']")).isSelected());

	}

	public void user_select_select_high_to_low() {

		
		selectbyvisibletext(filtertbn, "Price (high to low)");

	}

	public void user_validating_filter_high_to_low() {

		Assert.assertTrue(driver.findElement(By.cssSelector("[value='hilo']")).isSelected());

	}

	public void user_click_on_three_horizontal_bar() {
		
		clickbyexecutor(threebar);
	}

	public void user_click_on_logout_button() {

		
		clickbyexecutor(logoutbtn);
	}

	public void user_validating_logout_succesful() {

		Assert.assertTrue(driver.findElement(By.cssSelector("input#login-button")).isDisplayed());

	}

}

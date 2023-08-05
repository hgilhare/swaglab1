package page;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.base;
import io.cucumber.java.en.Then;

public class checkoutpage extends base {

	public By cartbutton = By.cssSelector("a.shopping_cart_link");
	public By frstnme = By.cssSelector("input#first-name");
	public By lstname = By.cssSelector("input#last-name");
	public By zipcode = By.cssSelector("input#postal-code");
	public By addtocartbtn = By.cssSelector("button#add-to-cart-sauce-labs-backpack");
	public By checkoutbtn = By.cssSelector("button#checkout");
	public By continuebtn = By.cssSelector("input#continue");
	public By finishbtn = By.cssSelector("button#finish");
	public By removebtn = By.cssSelector("button#remove-sauce-labs-backpack");

	public void user_click_on_add_to_cart_button() {

		normalclick(addtocartbtn);

		Assert.assertTrue(driver.findElement(By.cssSelector("button#remove-sauce-labs-backpack")).isDisplayed());
	}

	public void validating_add_to_cart_icon() {
		WebElement countbtn = driver.findElement(By.cssSelector("span.shopping_cart_badge"));
		String actualcount = countbtn.getText();
		Assert.assertEquals("1", actualcount);

	}

	public void user_click_on_cart_icon() {

		waitforexpectedelement(cartbutton).click();

	}

	public void user_click_on_checkout_button() {
		normalclick(checkoutbtn);
	}

	public void user_enter_info(String fname, String lname, String pcode) {

		waitforexpectedelement(frstnme).sendKeys(fname);
		waitforexpectedelement(lstname).sendKeys(lname);

		waitforexpectedelement(zipcode).sendKeys(pcode);

	}

	public void user_click_on_continue_button() {

		clickbyexecutor(continuebtn);

	}

	public void user_validate_checkout_overview() {

		Assert.assertTrue(driver.findElement(By.cssSelector("span.title")).isDisplayed());

	}

	public void user_click_on_finish_button() {

		clickbyexecutor(finishbtn);

	}

	public void user_validate_thank_you_message() {

		Assert.assertTrue(driver.findElement(By.cssSelector("h2.complete-header")).isDisplayed());
	}

	public void validate_error_message() throws IOException {
		takesnap();
		Assert.assertTrue(driver.findElement(By.cssSelector("[data-test='error']")).isDisplayed());

	}

	public void user_close_the_browser() {
		driver.quit();

	}

	public void user_click_on_remove_button() {
		clickbyexecutor(removebtn);
	}

	public void user_validating_succesful_removal_of_product() {

		Assert.assertTrue(driver.findElement(By.cssSelector("a.shopping_cart_link")).isDisplayed());

	}

}

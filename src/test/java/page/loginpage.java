package page;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import helper.base;

public class loginpage extends base {
	
	public By usrnme= By.cssSelector("input#user-name");
	public By pwd = By.cssSelector("input#password");
	public By loginbtn= By.cssSelector("input#login-button");


	public void user_enter_username_and_password() {
		waitforexpectedelement(usrnme).sendKeys(prop.getProperty("username"));
		waitforexpectedelement(pwd).sendKeys(prop.getProperty("password"));
		
		

	}

	public void user_click_on_login_button() {
		
		
		clickbyexecutor(loginbtn);

	}

	public void login_validate_succesfully() {
		
		Assert.assertTrue(driver.findElement(By.cssSelector("span.title")).isDisplayed());

	}

}

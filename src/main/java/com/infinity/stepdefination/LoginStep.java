package com.infinity.stepdefination;

import org.openqa.selenium.WebDriver;

import com.infinity.exception.InValidBrowserException;
import com.infinity.pages.Login_Page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStep extends Login_Page {

	public LoginStep(WebDriver driver) {
		super(driver);

	}

	Login_Page lp = new Login_Page(driver);
	
	@Given("Open browser and launch url")
	public void open_browser_and_launch_url() throws InValidBrowserException {
	    lp.setUp();
	    
	}

	@When("Enter username and password")
	public void enter_username_and_password() {
		lp.enterUserName();
		lp.enterPassword();

	}

	@And("Click on login button")
	public void click_on_login_button() {
		lp.clickOnLoginBtn();
	}
}

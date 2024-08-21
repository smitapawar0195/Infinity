package com.infinity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.infinity.base.Base;
import com.infinity.base.Config;

public class Login_Page extends Base {

	public Login_Page(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}

	Config con = new Config();

	@FindBy(xpath = "//input[@id=\"user-name\"]")
	public WebElement userName;

	@FindBy(xpath = "//input[@id=\"password\"]")
	public WebElement password;

	@FindBy(xpath = "//input[@id=\"login-button\"]")
	public WebElement loginBtn;

	public void enterUserName() {
		userName.sendKeys(con.enterUserName());

	}

	public void enterPassword() {
		password.sendKeys(con.enterPass());

	}

	public void clickOnLoginBtn() {

	}
}

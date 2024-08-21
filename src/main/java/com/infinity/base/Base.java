package com.infinity.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.infinity.exception.InValidBrowserException;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;



public class Base {
	protected WebDriver driver;
	Config con = new Config();
	
	public WebDriver setUp() throws InValidBrowserException {
		if (con.openBrowser().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (con.openBrowser().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new InValidBrowserException(con.openBrowser());
		}

		driver.get(con.launchUrl());
		driver.manage().window().maximize();
		return driver;
	}
	
	public void tearDown() throws Exception {
		driver.close();
	}

}

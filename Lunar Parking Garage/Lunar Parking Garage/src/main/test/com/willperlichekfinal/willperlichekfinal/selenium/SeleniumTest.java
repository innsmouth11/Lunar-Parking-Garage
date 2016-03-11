package com.willperlichekfinal.willperlichekfinal.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

/**
 * @author William
 *
 */
public class SeleniumTest {

	@SuppressWarnings("deprecation")
	@Test
	public void LoginPageTest() {
		LoginPage loginPage = new LoginPage(getDriver());

		String expectedUrl = "http://localhost:8080/home";
		String actualUrl = loginPage.getUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
	}

	private WebDriver getDriver() {
		return null;
	}

}

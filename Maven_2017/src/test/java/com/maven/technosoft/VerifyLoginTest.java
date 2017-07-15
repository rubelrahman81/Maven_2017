package com.maven.technosoft;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginTest extends DriverFactory {
	
	@Test
	public void verifyInvalidLogin() {
		HomePage homePage = new HomePage();
		LoginPage loginPage = new LoginPage();
		// enter email
		homePage.enterEmail("xyz32224@gmail.com");
		// enter password
		homePage.enterPassword("test1234");
		homePage.clickOnLoginButton();
		Assert.assertEquals(loginPage.getPageHeader(), "Log into Mohammad website");
	}
}

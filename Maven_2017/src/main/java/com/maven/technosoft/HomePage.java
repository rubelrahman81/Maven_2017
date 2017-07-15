package com.maven.technosoft;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	
	public void clickOnLoginButton() {
		clickOn(loginButton);
	}
	
	public void enterEmail(String enterEmail) {
		sendText(emailTextField, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		sendText(passwordTextField, enterPassword);
	}
}

package com.maven.technosoft;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

public class BasePage {
	
	public void clickOn(By locator) {
		try {
			DriverFactory.getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}
	
	public void sendText(By locator, String text) {
		try {
			DriverFactory.getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}
	
	public String getTextFromElement(By locator) {
		String text = null;
		try {
			text = DriverFactory.getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
		
		return text;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

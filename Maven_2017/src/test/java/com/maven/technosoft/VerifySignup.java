package com.maven.technosoft;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifySignup extends DriverFactory{

	@Test
	public void verifyValidSignup() {
		//FirstName
		getDriver().findElement(By.id("u_0_1")).sendKeys("Mohammad");
		//LastName
		getDriver().findElement(By.id("u_0_3")).sendKeys("Muntakim");
		//Click on Signup button
		getDriver().findElement(By.id("u_0_l")).click();
		//Verify user home page
	}
}

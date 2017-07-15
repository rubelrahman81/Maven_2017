package com.maven.technosoft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverFactory {

	private static WebDriver driver = null;
	private static final String URL = "https://facebook.com/";
	// private static final String alertURL =
	// "http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	// private static final String calender = "https://www.hotels.com/";
	// private static final String autoComplete = "https://www.expedia.com/";
	// private static final String hoverOver = "https://dhtmlx.com/";

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeClass
	public void intializeWebDriver() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/rubel/Desktop/java lib/chromedriver.exe");
		driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver",
		// "/Users/mohammadmuntakim1/Downloads/geckodriver");
		// driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}
}

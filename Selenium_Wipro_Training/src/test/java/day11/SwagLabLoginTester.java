package day11;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import saucedemopages.SwagLabLoginPage;

public class SwagLabLoginTester extends BaseTest {
	
	WebDriver webDriver;
	
	@BeforeClass
	public void setUp() {
		webDriver=getWebDriver();
	}
	
	@Test
	public void verifyLogin() {
		SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(webDriver);
		swagLabLoginPage.setUserName("standard_user");
		swagLabLoginPage.setPassword("secret_sauce");
		swagLabLoginPage.onClick();
		String actualUrl = webDriver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/";
		Assert.assertEquals(actualUrl, expectedUrl);
	}
}

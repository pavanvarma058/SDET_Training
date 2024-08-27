package day11;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import saucedemopages.SwagLabDashboardPage;
import saucedemopages.SwagLabLoginPage;

public class SwagLabLoginTester2 extends BaseTest {
	
	WebDriver webDriver;
	
	@BeforeClass
	public void setUp() {
		webDriver=getWebDriver();
	}
	
	@Test
	public void verifyLogin() {
		SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(webDriver);
		SwagLabDashboardPage dashboardPage = swagLabLoginPage.verifyLogin("standard_user", "secret_sauce");
		Assert.assertTrue(dashboardPage.isVerifyLogin("Products"));
	}
}

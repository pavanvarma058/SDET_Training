package day11;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;


import org.openqa.selenium.WebDriver;



public class PageTitleUrlTester extends BaseTest {
	
	WebDriver webDriver;
	
	@BeforeClass
	public void setup() {
		webDriver = getWebDriver();
	}
	
	
	@Test
	public void BrowserTitleTest() throws InterruptedException {
		
		String actualTitle = webDriver.getTitle();
		String expectedTitle = "Swag Labs";
		Assert.assertEquals(actualTitle, expectedTitle);
	}	
}

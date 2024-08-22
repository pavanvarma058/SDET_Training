package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTester extends BaseTest {
	
	WebDriver webDriver;
	
	@BeforeClass
	public void setup() {
		webDriver=getWebDriver();
	}
	
	@Test
	public void verifyLogin() throws InterruptedException {
//		By usernameLocator = By.id("user-name");
		
		//if you want to find any webelement that are present on the web page
		//using webDriver you can find out
		WebElement usernameWebElement = webDriver.findElement(By.id("user-name"));
		// perform the action with webElement
		// Use this method to simulate typing into an element, which may set its value.
		usernameWebElement.sendKeys("standard_user");
		
		Thread.sleep(2000);
		
		WebElement passwordWebElement = webDriver.findElement(By.id("password"));
		passwordWebElement.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		WebElement loginButtonWebElement = webDriver.findElement(By.id("login-button"));
		loginButtonWebElement.click();
		Thread.sleep(2000);
		
		String actualUrl = webDriver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualUrl, expectedUrl);
	}
}

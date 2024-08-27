package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import base.BaseTest;

public class ExplicityWaitDemo extends BaseTest {
	
	WebDriver webDriver;
	@BeforeClass
	public void setup() {
		webDriver=getWebDriver();
	}
	
	
	public void explicitWaitTest() {
	WebElement simpleButtonWebElement =	webDriver.findElement(By.xpath("//input[@id='simple'"));
	}

}

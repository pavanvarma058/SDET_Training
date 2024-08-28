package day11;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;

public class ExplicityWaitDemo extends BaseTest {
	
	WebDriver webDriver;
	@BeforeClass
	public void setup() {
		webDriver=getWebDriver();
	}
	
	@Test
	public void explicitWaitTest() throws InterruptedException {
		WebElement simpleButtonWebElement =	webDriver.findElement(By.xpath("//*[@id=\'simple\']"));
		simpleButtonWebElement.click();
		
		WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
		webDriverWait.until(ExpectedConditions.alertIsPresent());
		
		// switch to alertbox from web page
		Alert alert = webDriver.switchTo().alert();
		Thread.sleep(2000);
		// by calling accept() method on alert we can click on "ok" button
		alert.accept();
		Thread.sleep(2000);
//		alert.dismiss();
	}

}

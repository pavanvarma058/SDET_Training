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

public class ConfirmBoxTester extends BaseTest {
	
	WebDriver webDriver;
	@BeforeClass
	public void set() {
		webDriver=getWebDriver();
	}
	@Test
	public void confirmBoxTester() throws InterruptedException {
		WebElement  confirmBox = webDriver.findElement(By.xpath("//button[@id='confirm']"));
		confirmBox.click();
		// explicit wait until confirm box is available
		WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
		webDriverWait.until(ExpectedConditions.alertIsPresent());
		
		// switch to alert window
		Alert alert = webDriver.switchTo().alert();
		Thread.sleep(2000);
		// alert.dismiss(); --> to cancel the confirm
		alert.accept(); // --> to accept the confirm
		Thread.sleep(2000);
	}
}

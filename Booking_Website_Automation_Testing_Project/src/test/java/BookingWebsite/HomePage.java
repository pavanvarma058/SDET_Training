package BookingWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePage.BaseTest;

public class HomePage extends BaseTest{
	
	WebDriver webDriver;
	
	@BeforeClass
	public void set() {
		webDriver=getWebDriver();
	}
	
	@Test
	public void HomePageTester() {
		WebElement searchTextBox = webDriver.findElement(By.xpath("//input[@id=':rh:']"));
		searchTextBox.sendKeys("New York");
		WebElement checkIn = webDriver.findElement(By.xpath("//button[@data-testid='date-display-field-start']"));
		checkIn.click();
		checkIn.sendKeys("2024-12-01");
		WebElement checkOut = webDriver.findElement(By.xpath("//button[@data-testid='date-display-field-end']"));
		checkOut.click();
		checkOut.sendKeys("2024-12-05");
		WebElement searchBtn = webDriver.findElement(By.xpath("//button[@type='submit']"));
		searchBtn.click();
	}

}

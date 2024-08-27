package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;

public class DropDownHandler extends BaseTest {
	
	WebDriver webDriver;
	
	@BeforeClass
	public void setup() {
		webDriver = getWebDriver();
	}
	@Test
	public void dropDownTest() throws InterruptedException {
		// find the dropdown
	WebElement dropDownWebElement =	webDriver.findElement(By.xpath("//select[@name='country']"));
	
	// create a select class
	Select select = new Select(dropDownWebElement);
	// All options belonging to this select tag
	List<WebElement> alloptions = select.getOptions();
	System.out.println("Total Options: " + alloptions.size());
	Thread.sleep(2000);
	select.selectByVisibleText("Afghanistan");
	Thread.sleep(2000);
	}
}

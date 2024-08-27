package saucedemopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabDashboardPage {
	
	WebDriver webDriver;
	
	public SwagLabDashboardPage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}
	By messageLocator = By.xpath("//span[text()='Products']");
	
	public String getMessage() {
	// Get the visible 	(i.e. not hidden by CSS) text of this element,
	return	webDriver.findElement(messageLocator).getText();
	}
	
	public boolean isVerifyLogin(String text) {
		if(getMessage().equals(text)) {
			return true;
		}else {
			return false;
		}
	}
}

package saucedemopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabLoginPage {
	
	WebDriver webDriver;
	
	public SwagLabLoginPage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}
	By usernameLocator = By.xpath("//input[@id='user-name']");
	By passwordLocator = By.xpath("//input[@id='password']");
	By loginButtonLocator = By.xpath("//input[@id='login-button']");
	
	public void setUserName(String username) {
		webDriver.findElement(usernameLocator).sendKeys(username);
	}
	
	public void setPassword(String password) {
		webDriver.findElement(passwordLocator).sendKeys(password);
	}
	
	public void onClick() {
		webDriver.findElement(loginButtonLocator).click();
	}
	
	public SwagLabDashboardPage verifyLogin(String username, String password) {
		SwagLabDashboardPage dashboardPage = null;
		setUserName(username);
		setPassword(password);
		onClick();
		dashboardPage = new SwagLabDashboardPage(webDriver);
		return dashboardPage;
	}
}

package day11;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserTester {
	
	@Test
	public void launchBrowserTest() {
		// Launch or open the browser
		// Using webDriver
		// Managing WebDriver for Edge Browser
		WebDriverManager.edgedriver().setup();
//		WebDriverManager.chromedriver().setup();
		
		// create the instance of EdgeDriver
		
		WebDriver webDriver = new EdgeDriver();
		
		//Using get method of WebDriver we can Load a new web page in the current browser window
		webDriver.get("https://www.google.com/");
		
		// close the current window
		webDriver.close();
	}
}

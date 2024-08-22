package day11;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class NavigationBrowserDemo2 {
	
	@Test
	public void navigationBrowserTest() throws InterruptedException {
		// Launch or open the browser
		// Using webDriver
		// Managing WebDriver for Edge Browser
		WebDriverManager.edgedriver().setup();
//		WebDriverManager.chromedriver().setup();
		
		// create the instance of EdgeDriver
		
		WebDriver webDriver = new EdgeDriver();
		
		webDriver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//Using navigation object we can perform navigation activity
		// Load a new web page in the current browser window
		webDriver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		// Move back a single "item" in the browser's history
		webDriver.navigate().back();
		Thread.sleep(2000);
		
		// Move a single "item" forward in the browser's history
		webDriver.navigate().forward();
		Thread.sleep(2000);
		
		// refresh the current window
		webDriver.navigate().refresh();
		// close the current window
		webDriver.close();
	}

}

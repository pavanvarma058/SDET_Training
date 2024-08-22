package day11;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class PageUrlTester {
	
	@Test
	public void navigationBrowserTest() throws InterruptedException {
		// Launch or open the browser
		// Using webDriver
		// Managing WebDriver for Edge Browser
		WebDriverManager.edgedriver().setup();
//		WebDriverManager.chromedriver().setup();
		
		// create the instance of EdgeDriver
		
		WebDriver webDriver = new EdgeDriver();
		
		// Load a new web page in the current browser window
		webDriver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		// Using getCurrentUrl() method in webDriver we can get the current URL of the window
		String actualUrl = webDriver.getCurrentUrl();
		String expectedUrl = "https://www.google.com/";
		Assert.assertEquals(actualUrl, expectedUrl);
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Pass: Url is google.com");
		}else {
			System.out.println("Fail: Url is not google: Actual title is: " +actualUrl);
		}
		
		// close the current window
		webDriver.close();
	}

}

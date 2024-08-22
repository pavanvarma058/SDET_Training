package day11;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class PageTitleTester {
	
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
		
		// Using getTitle() method of webdriver we can get the title of the current page
		String actualTitle = webDriver.getTitle();
		String expectedTitle = "Google";
		Assert.assertEquals(actualTitle, expectedTitle);
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: Title is google");
		}else {
			System.out.println("Fail: Title is not google: Actual title is: " +actualTitle);
		}
		
		// close the current window
		webDriver.close();
	}

}

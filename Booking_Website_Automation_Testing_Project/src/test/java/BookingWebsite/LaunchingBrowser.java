package BookingWebsite;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser {
	
	@Test
	public void launchBrowserTest() {
		// Launch or open the browser
		// Using webDriver
		// Managing WebDriver for Edge Browser
		WebDriverManager.edgedriver().setup();
		
		// create the instance of EdgeDriver
		WebDriver webDriver = new EdgeDriver();
		
		//Using get method of WebDriver we can Load a new web page in the current browser window
		webDriver.get("http://www.booking.com/");
		
		// close the current window
		webDriver.close();
	}
}

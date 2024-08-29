package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
private WebDriver webDriver;
	
	public WebDriver getWebDriver() {		
		return webDriver;
	}
	
	private void initialize(String browser, String url) {
		
		switch(browser) {
		case "edge":
			WebDriverManager.edgedriver().setup();
			webDriver = new EdgeDriver();
			webDriver.get(url);
			break;
		case "chrome":
			WebDriverManager.chromedriver().setup();
			webDriver = new ChromeDriver();
			webDriver.get(url);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			webDriver = new FirefoxDriver();
			webDriver.get(url);
			break;
		}
	}
	
	@BeforeClass
	@Parameters ({"browser", "url"})
	public void setup(@Optional("edge") String browser,@Optional("http://www.booking.com/") String url) {
		initialize(browser, url);
	}
	
	@AfterClass 
	public void tearDown() {
		webDriver.close();
	}
}

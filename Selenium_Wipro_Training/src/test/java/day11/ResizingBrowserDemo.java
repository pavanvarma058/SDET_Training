package day11;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class ResizingBrowserDemo {
	
	@Test
	public void launchBrowserTest() throws InterruptedException {
		// Launch or open the browser
		// Using webDriver
		// Managing WebDriver for Edge Browser
		WebDriverManager.edgedriver().setup();
//		WebDriverManager.chromedriver().setup();
		
		// create the instance of EdgeDriver
		
		WebDriver webDriver = new EdgeDriver();
		
		//Resize the browser 
		Dimension dimension = new Dimension(200, 200);
		// Set the size of the current window
		webDriver.manage().window().setSize(dimension);
		
		Thread.sleep(2000);
		
		// Move the browser
		
		Point point = new Point(300, 200);
		// Set position of the current window
		webDriver.manage().window().setPosition(point);
		
		
		Thread.sleep(2000);
		
		//Maximizes the current window if it is not already maximized 
		webDriver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// close the current window
		webDriver.close();
	}

}

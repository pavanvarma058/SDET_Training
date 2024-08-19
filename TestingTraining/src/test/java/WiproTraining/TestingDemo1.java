package WiproTraining;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingDemo1 {
	
	// It will run before each method
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Inside after method");
	}

	@Test
	public void TestCase1() {
		System.out.println("Test Case 1");
	}
	
	@Test
	public void TestCase2() {
		System.out.println("Test Case 2");
	}
}

package WiproTraining;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import day10.Calci;

public class CalciTester {
	
	Calci calci;
	@BeforeMethod
	public void calciCreation() {
		calci = new Calci();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void addTest() {		
		int actualSum = calci.add(10, 20);
		int expectedSum = 30;
		Assert.assertEquals(actualSum, expectedSum);
	}
	
	@AfterMethod
	public void calciDestruction() {
		calci = null;
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public void subTest() {
		int actualSum = calci.sub(100, 20);
		int expectedSum = 80;
		Assert.assertEquals(actualSum, expectedSum);
	}

}

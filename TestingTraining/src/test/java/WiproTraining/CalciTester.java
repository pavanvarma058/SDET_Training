package WiproTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

import day10.Calci;

public class CalciTester {
	
	@Test
	public void addTest() {
		
		Calci calci = new Calci();
		
		int actualSum = Calci.add(10, 20);
		int expectedSum = 30;
		Assert.assertEquals(actualSum, expectedSum);
	}

}

package WiproTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

import day10.PrimeOrNot;

public class PrimeTester {
	
	@Test
	public void primeTest() {
		Assert.assertEquals(new PrimeOrNot().isPrime(3), false);
	}
}

package WiproTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

import day10.AutomorphicNumber;

public class AutomorphicTester {
	
	@Test
	public void autoMorphicTest() {
		Assert.assertEquals(new AutomorphicNumber().isAutomorphic(25), true);
	}
}

package WiproTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

import day10.ArmStrongOrNot;

public class ArmStrongTester {
	
	@Test
	public void armStrongTest() {
		Assert.assertEquals(new ArmStrongOrNot().isArmStrong(0), true);
	}
}

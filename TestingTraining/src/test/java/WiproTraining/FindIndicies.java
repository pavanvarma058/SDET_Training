package WiproTraining;

import org.testng.Assert;
import org.testng.annotations.Test;

import day10.IndicesofNumber;

public class FindIndicies {
	
	@Test
	public void findIndiciesTester() {
		Assert.assertEquals(new IndicesofNumber().findIndices(new int[] {1, 2, 4, 1, 4, 1, 2, 0, 1}, 1), new int[] {0, 3, 4, 8});
	}
}

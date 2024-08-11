package WiproTraining;

import org.testng.Assert;

import day10.PalindromOrNot;

public class palindromeTester {
	
	public void palindromeTest() {
		PalindromOrNot p = new PalindromOrNot();
		Assert.assertEquals(p.isPalindrome("root"), false);
		Assert.assertEquals(p.isPalindrome("racecar"), true);
	}
}

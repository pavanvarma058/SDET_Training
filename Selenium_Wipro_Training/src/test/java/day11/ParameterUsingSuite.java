package day11;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterUsingSuite {
	
	@BeforeClass
	@Parameters ({"author", "descr"})
	public void testInfo(@Optional("john") String author,@Optional("descr") String descr) {
		System.out.println("Author = " +author);
		System.out.println("Description = " +descr);
	}
	
	@Test
	public void testCase1() {
		System.out.println("This is test case1");
	}
	public void testCase2() {
		System.out.println("This is test case2");
	}
}

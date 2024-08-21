package WiproTraining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1_TestNG_DataProvider {
	
	//if you want to execute same test case multiple times for different different input then we should go for 
	// parameterized testing
	
	@Test (dataProvider = "tdata")
	public void test1(int n) {
		System.out.println("value of n= " + n);
	}
	
	// we can provide input test data to the test case using DataProvider
	// DataProvider  is a method by which we can supply or provide input test data to the test case method
	
	//Mark a method as supplying data for a test method
	@DataProvider (name="tdata")
	public Integer[] getData() {
		Integer[] arr = {10,20,3,45,6,86};
		return arr;
	}
}


package WiproTraining;

import org.testng.annotations.Test;

public class Demo02_TestNG_Priority {
	
	// When you define test case inside tester class the test case executed in alphabetically order
	// it's not executed n which order you have define
	
	@Test (priority = 2)
    public void test01() 
    {
        System.out.println("Inside Test01 Method");
    }


    @Test (priority = 1)
    public void test02() 
    {
        System.out.println("Inside Test02 Method");
    }


    @Test (priority = 0)
    public void test03()
    {
        System.out.println("Inside Test03 Method");
    }

}

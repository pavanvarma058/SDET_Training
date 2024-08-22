package WiproTraining;

import org.testng.annotations.Test;

public class Demo3_TestNG_Dependencies {
	
	@Test
    public void login() 
    {
        System.out.println("Code to login into the AUT");
    }


    @Test (dependsOnMethods = {"login"})
    public void dashboard()
    {
        System.out.println("Dashboard Page");
    }


   @Test (dependsOnMethods = {"dashboard"})
    public void logout() 
    {
        System.out.println("Logout from the application");
    }

}

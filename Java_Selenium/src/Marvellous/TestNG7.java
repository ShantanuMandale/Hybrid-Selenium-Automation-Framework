// real time example. Before adding item in cart we have to login if login fail we cannot add item means adding item in depend on login and logout

package Marvellous;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7 {
	
	@Test
	public void loginTest()
	{   
		boolean login = false;   // do false after run
		Assert.assertTrue(login, "Cannot login");
		
	}
	
	@Test(dependsOnMethods = {"loginTest"})
	public void addCart()
	{   
		System.out.println("Add product in cart successfully");   // this test pass only when loginTest executes
	}
	
	@Test(dependsOnMethods = {"addCart"})
	public void Logout()
	{   
		System.out.println("Logout successfully");   // this test pass only when addCart executes
	}

}


//if we want to exeute all classes/TestNG files in one time then go to -> package right click -> TestNG -> convert to TestNG  

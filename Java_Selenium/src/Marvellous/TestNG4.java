// Skipping Test Cases

package Marvellous;

import org.testng.SkipException;
import org.testng.annotations.Test;



public class TestNG4 {
	
	//1st way
	
	//@Test                              just comment it
	public void a()
	{
		System.out.println("Hello a test method");
	}
	
	//2nd way
	
	@Test(enabled = false)                 // it won't execute      
	public void b()
	{
	  System.out.println("Hello b test method");
	}
	
	@Test(enabled = true)                 // it will execute     
	public void c()
	{
	  System.out.println("Hello c test method");
	}
	
	//3rd way
	
	@Test(invocationCount = 0)         // not execute                  
	public void d()
	{
	  System.out.println("Hello d test method");
	}
	
	@Test(invocationCount = 2)         //executes 2 times           
	public void e()
	{
	  System.out.println("Hello d test method");
	}
	
	//4rth way
	
	@Test                      
	public void f()
	{
	  System.out.println("Hello f test method");
	  throw new SkipException("Skipping test f method");    // it will skip properly
	}
	
	

}

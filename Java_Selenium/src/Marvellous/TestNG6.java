package Marvellous;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNG6 {
	
	@Test
	
	public void z()
	{
		Assert.assertTrue(3 < 12);      // condition true (execute)    
		System.out.println("Hello z test method");
	}
	
	@Test
	public void b()
	{
		Assert.assertTrue(3 > 12);      // condition false  (not Execute)     
		System.out.println("Hello b test method");
	}
	
	@Test(dependsOnMethods = {"b"})       // if 'b' test method executes then this will executes otherwise not 
	public void a()
	{
		System.out.println("Hello a test method");
	}
	
	@Test(dependsOnMethods = {"b","z"})       // if 'b' and 'z' test method executes then this will executes otherwise not 
	public void d()
	{
		System.out.println("Hello d test method");
	}


}

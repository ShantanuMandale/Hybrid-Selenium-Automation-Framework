//want to excutes test as per we want

package Marvellous;

import org.testng.annotations.Test;

public class TestNG3 {
	
	@Test(priority = -10)
	public void a()
	{
		System.out.println("Hello a Test method");   // 1st coz lowest number
	}
	
	@Test(priority = 2)
	public void b()
	{
		System.out.println("Hello b Test method");   //  4rth
	}
	
	@Test(priority = 0)
	public void c()
	{
		System.out.println("Hello c Test method");   // 2nd
	}
	
	@Test
	public void d()
	{
		System.out.println("Hello d Test method");   // 3rd  coz nothing means 0
	}

}

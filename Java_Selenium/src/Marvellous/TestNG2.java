//test execution order 

package Marvellous;

import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test
	public void a3()
	{
		System.out.println("Hello a3 test method");  //    2nd
	}
	
	@Test
	public void z()
	{
		System.out.println("Hello z test method");   //  4rth
	}
	
	@Test
	public void ab()
	{
		System.out.println("Hello ab test method");    //  3rd
	}
	
	@Test
	public void a1()
	{
		System.out.println("Hello a1 test method");   //1st
	}

}

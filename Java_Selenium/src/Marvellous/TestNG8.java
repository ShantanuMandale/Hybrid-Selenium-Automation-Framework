package Marvellous;

import org.testng.annotations.Test;

public class TestNG8 {
	
	@Test(groups = "Regression")
	public void a()
	{
		System.out.println("Hello a Test method");
	}
	
	@Test(groups = "Regression")
	public void b()
	{
		System.out.println("Hello b Test method");
	}
	
	@Test(groups = {"Regression", "Smoke"})
	public void c()
	{
		System.out.println("Hello c Test method");
	}
	
	@Test(groups = {"Regression", "Sanity"})
	public void d()
	{
		System.out.println("Hello d Test method");
	}
	
	@Test(groups = "Sanity")
	public void e()
	{
		System.out.println("Hello e Test method");
	}
	
	@Test(groups = "Regression")
	public void f()
	{
		System.out.println("Hello f Test method");
	}

}

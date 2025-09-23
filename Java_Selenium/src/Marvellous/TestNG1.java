package Marvellous;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;      //
import org.testng.annotations.BeforeMethod;     //
import org.testng.annotations.BeforeSuite;      //    use  import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;       //
import org.testng.annotations.Test;             //

public class TestNG1 {
	
	@Test      // it reduce the dependencies of java main method
	public void a2()
	{
		System.out.println("Hello a2 Test method");   //  11th
	}
    
	@BeforeTest      
	public void b()
	{
		System.out.println("Hello b method");      // 2nd
	}
	
	@BeforeSuite     
	public void c()
	{
		System.out.println("Hello c method");      // 1st    
	}
	
	@AfterMethod      
	public void d()
	{
		System.out.println("Hello d method");    // 6th  -  9th  - 12th
	}
	
	@BeforeClass      
	public void e()
	{
		System.out.println("Hello e method");   // 3rd
	}
	
	@AfterTest      
	public void f()
	{
		System.out.println("Hello f method");    // 14th
	}
	
	@AfterClass     
	public void g()
	{
		System.out.println("Hello g method");    //  13th
	}
	
	@BeforeMethod     
	public void h()
	{
		System.out.println("Hello h method");    // 4rth  -  7th  - 10th
	}
	
	@AfterSuite
	public void i()
	{
		System.out.println("Hello i method");   // 16th
	}
	
	@Test     
	public void a1()
	{
		System.out.println("Hello a1 Test method");  // 8th
	}
	@Test     
	public void A1()
	{
		System.out.println("Hello A1 Test method");     // 5th
	}
}

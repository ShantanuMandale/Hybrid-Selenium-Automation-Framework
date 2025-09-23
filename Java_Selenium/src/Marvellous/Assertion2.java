package Marvellous;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	
	@Test
	public void TestCase2()
	{
		String actualResult = "abc";
		String expectedResult = "abc";
		
		int a = 10;
		int b = 20;
		
		//Equal Assertion
	    Assert.assertEquals(actualResult, expectedResult, "Both are not matching");  // Not equal if different
	    System.out.println("Equal Assertion verfied");
	    // if this assertion failed then further code will not work
	    
	    Assert.assertFalse(a > b);
	    System.out.println("False Assertion verfied");
	    
	    Assert.assertTrue(a > b); // false
	     //not work
	    //Assertion is failed test execution will stop here
	    //further line of code will not executes
	    System.out.println("True Assertion verfied");
	}
	
	@Test
	public void TestCase3()
	{
		System.out.println("Hello Testcase3 method");
		//it will execute coz its is another testcase() method
		//Assertion is written in TestCase2() method
		//scope of ther assertion is limited to testcase2()method only
	}

}

//Using try catch block we can make further code executable even after fail of assertion   

package Marvellous;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	
	@Test
	public void TestCase2()
	{
		String actualResult = "abc";
		String expectedResult = "ab";
		
		int a = 10;
		int b = 20;
		
		//Equal Assertion
	    try {
			Assert.assertEquals(actualResult, expectedResult, "Both are not matching");  // Not equal
		} catch (Error e) {
			
		}
	    System.out.println("Equal Assertion verfied");
	    
	    
	    Assert.assertFalse(a > b);
	    System.out.println("False Assertion verfied");
	    
	    Assert.assertTrue(a < b); // false
	    
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

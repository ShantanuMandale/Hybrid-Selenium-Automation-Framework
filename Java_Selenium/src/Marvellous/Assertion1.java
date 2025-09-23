package Marvellous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion1 {
	
	@Test
	public void TestCase1()
	{
		String ExpectedResult = "Facebook helps you connect and share with the people in your life.";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String ActualResult = driver.findElement(By.xpath("//*[contains(text(), 'Facebook helps you connect')]")).getText();
		
		//Equal assertion
		Assert.assertEquals(ExpectedResult, ActualResult);// Test passed
		System.out.println("Equal Assertion verfied");
	    
		//Assertion False
		Assert.assertFalse(driver.findElement(By.xpath("//*[contains(text(), 'Facebook helps you connect')]")).isSelected());  // False -> Test passed
		System.out.println("False Assertion verfied");
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Facebook helps you connect')]")).isDisplayed());  // True -> Test passed
		System.out.println("True Assertion verfied");
	}

}

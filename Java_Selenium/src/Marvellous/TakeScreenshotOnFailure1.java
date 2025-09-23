package Marvellous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotOnFailure1 {
	
	TakeScreenshotOnFailure t1 = new TakeScreenshotOnFailure();  //previous program class object
	
	@Test
	public void doLogin()
	{
		WebDriverManager.chromedriver().setup();
		t1.driver = new ChromeDriver();  //we can access previous program data there we declared webdriver
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		t1.driver.get("http://www.facebook.com");
		t1.driver.findElement(By.id("emaidvl")).sendKeys("12334"); //suppose wrong 
	}
	
	@AfterMethod
	public void TakeScreenshot(ITestResult result2) throws Exception
	{
		t1.captureScreenshot(result2);
	}
}

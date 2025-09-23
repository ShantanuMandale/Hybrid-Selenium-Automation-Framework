//if any test case are getting failed it will take a screenshot

package Marvellous;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure {
	
	WebDriver driver;
	
	//iTestResult provide us the test case execution status and test name
	
	public void captureScreenshot(ITestResult result) throws Exception   //this method takes a parameter which provide by testng
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
			//create a ref of TakeScreenshot interface and type casting
			
			TakesScreenshot ts = (TakesScreenshot) driver;  // like javaScript executer
			
			// use getScreenshotAs() to capture the screenshot in file format
			
			File SourceFile = ts.getScreenshotAs(OutputType.FILE);
			
			// Copy the file to specific location
			
			File destFolder = new File("./screenshot/" + result.getName() + ".png");
			
			FileUtils.copyFile(SourceFile, destFolder);
			
			System.out.println(result.getName() + "Method() failed Screensshot caputred");
			
		}
	}

}

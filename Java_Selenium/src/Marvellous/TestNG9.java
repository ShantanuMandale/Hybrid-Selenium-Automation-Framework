package Marvellous;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG9 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setEnv()
	{  
		//setting property of chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	//now provide datas
	@DataProvider
	public Object[][] dataSet() throws Exception //object[][] returns any type of 2d array data(int,float,string etc)
	{
		File src = new File("C:\\Users\\Dell\\eclipse-workspace\\Java_Selenium\\Repository\\TestData.properties");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		
		Object Arr[][] = new Object[3][2];   //we can store any type of array
		
		Arr[0][0] = pro.getProperty("TestData1");    // shantanu2001@gmail.com
		Arr[0][1] = pro.getProperty("TestData2");     // Pass@123
		
		Arr[1][0] = "mandale123@gmail.com";
		Arr[1][1] = "1234";
		                                                   // random
		Arr[2][0] = "don123@gmail.com";
		Arr[2][1] = "134634";
		
		return Arr;
	}
	
	@Test(dataProvider = "dataSet")  // method
	public void enterData(String Username, String Password) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(Password);
		
	}

}

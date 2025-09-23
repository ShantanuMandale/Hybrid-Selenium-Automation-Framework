package Marvellous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication2 {

	public static void main(String[] args) throws InterruptedException {
		
		//setting the property of chrome driver and and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   
	 //Launching chrome browser instance
	   WebDriver driver = new ChromeDriver();
	     
	   //maximize the window
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   
	   //open url using get() method
	   Thread.sleep(2000);
	   driver.get("http://www.facebook.com");
	   
	   //delete all cookies
	   Thread.sleep(2000);
	   driver.manage().deleteAllCookies();
	   
	   //open url using another method
	   Thread.sleep(2000);
	   driver.navigate().to("http://www.instagram.com");
	   
	   //refresh page
	   Thread.sleep(2000);
	   driver.navigate().refresh();
	   
	   // to get back in to facebook from instagram page
	   Thread.sleep(2000);
	   driver.navigate().back();
	   
	   //again open instagram 
	   Thread.sleep(2000);
	   driver.navigate().forward();
	   
	   //fetch current url
	   Thread.sleep(2000);
	   System.out.println(driver.getCurrentUrl());
	   
	   //fetch title of url page
	   System.out.println(driver.getTitle());
	   
	   // to close the browser instance
	   driver.close();	   
	}

}
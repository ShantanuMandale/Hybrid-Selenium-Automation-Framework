package Marvellous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 { 

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//webTable url
		driver.get("https://facebook.com/");
		
		//to delete all cookies 
		
		Thread.sleep(2000);
		
		// JavascriptExecuter
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//Locate webElement using JavaScript
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");  // instead of findElement we use getElement  id is unique 
		Thread.sleep(2000);
		jse.executeScript("document.getElementsByName('pass')[0].value='1234'");         // we use getElement's' coz name is comman
		Thread.sleep(2000);
		jse.executeScript("document.getElementsByName('login')[0].click()");       // to hit login button
		  
		Thread.sleep(5000);
		
		// Scrolling down webpage using javascript
		jse.executeScript("window.scrollBy(0, 500)");
		 
		Thread.sleep(2000);
		
		//scrolling up webpage using javascript
		jse.executeScript("window.scrollBy(0, -500)");
	
	}
}
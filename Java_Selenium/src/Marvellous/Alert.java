package Marvellous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//webTable url
		driver.get("https://demoqa.com/alerts");
		
		//Accept Alerts using JavascriptExecuter
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('confirmButton').click()");
	//	driver.findElement(By.id("confirmButton")).click(); can also use
		
		System.out.println(driver.switchTo().alert().getText());   // to print what type msg/alert 
		
		// Accept Alerts (click ok)
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		
		//to dismisse alert(click cancel)
//		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
//		System.out.println("Alert Dismissed");
		

	}

}

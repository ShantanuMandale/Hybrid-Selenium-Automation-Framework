package Marvellous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java  selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("susccessfully open");
		
		 Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys("shantanumandale2001@gmail.com");
	     
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("12345");
	     
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@type='submit']")).click();		
		
		
	}

}

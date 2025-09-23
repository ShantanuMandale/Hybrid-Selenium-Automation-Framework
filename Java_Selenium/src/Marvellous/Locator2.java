
package Marvellous;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		//To locate specific webelement from webpage and pass the key/ data
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("shantanumandale2001@gmail.com");
		
		// webelement locate using Multiple Attribute
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass'][@id ='pass']")).sendKeys("12345");
		
		//if we want locate login button from facebook page and click it
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		
		//if we want to locate some text from webpage
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()= 'Facebook helps you connect and share with the people in your life.'"));
  }

}

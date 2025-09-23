/*
 
 we can create a relative xpath by usubg following attributes
 1- using single attribute - //tagName[@AttrubuteName = 'Attrubute value']
 2- using multiple attributes - //tagName[@AttributeName1 = ' Attribute value'][@AttributeName2= 'Attribute value']
 3- using contains method     - //tagname[contains(@attributeName,'attribute value') 
 4 - using text() method      - //tagName[text()='text we are searching for']
 
*/

package Marvellous;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		//if we want to locate specific webelement from webpage by using single Attribute from facebook page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id ='email']"));
		
		// webelement locate using Multiple Attribute
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass'][@id ='pass']"));
		
		//if we want locate login button from facebook page by using contains method 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		
		//if we want to locate some text from webpage
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()= 'Facebook helps you connect and share with the people in your life.'"));
  }

}

package Marvellous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//webTable url
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//span[@title='Sign In']")).click();
		
		//find total number of frame presnt in webpage
		int CountFrame = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames are = "+CountFrame);

		//check element present or not
		
		for(int i = 0; i < CountFrame; i++)
		{
			driver.switchTo().frame(i); //parent frame
			driver.switchTo().frame(i);  // child frame
			
			String expResult = "Open Paytm App";   //find this element
			String actResult = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
			
			if(actResult.equalsIgnoreCase(actResult))
			{
				System.out.println("Element found");
				break;	
			}
			else
			{
				System.out.println("Element not found");
				
			}
		}
	
	}

}

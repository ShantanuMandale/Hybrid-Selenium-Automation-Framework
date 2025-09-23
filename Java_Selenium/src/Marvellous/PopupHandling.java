package Marvellous;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//webTable url
		driver.get("https://demoqa.com/browser-windows");
		String parentWindowId = driver.getWindowHandle();  // for single window tab
		JavascriptExecutor jse = (JavascriptExecutor) driver;  // 
			
		// step 1- Tab handling
	    
		jse.executeScript("window.scrollBy(0,500)"); //  i face the advertisement overlaping issue thats why i use this 
		Thread.sleep(2000);
		driver.findElement(By.id("tabButton")).click();
		
		
		//get the total number of open tab
		Set<String> allWindowsId = driver.getWindowHandles();   //use's' for multiple tab
		System.out.println("All window Id: "+allWindowsId);
		
		System.out.println("Total number of tabs open: "+allWindowsId.size());
		
		
		for(String window : allWindowsId)
		{
		   driver.switchTo().window(window);
		   
		   System.out.println("Windows Id "+window);  // get id
		}
		//get Parent window id 
		
		System.out.println("Parent Window ID: "+parentWindowId);
		
		//get child url and title of tab
		
		for(String window: allWindowsId)
		{
			driver.switchTo().window(window);
			if(!window.equals(parentWindowId))
			{
				System.out.println("child tab url: "+driver.getCurrentUrl());	
			}
			else
			{
				System.out.println("Parent tab title: "+driver.getTitle());
			}
			
		}
		
		// Step-2 Window Handling
		//for handling window it needs to be on parent window first so
		Thread.sleep(2000);
		driver.switchTo().window(parentWindowId);
		
		WebDriverWait wt = new WebDriverWait(driver, 30);                               // some browser has internet issue it delay to lead page so element not found so use it 
		wt.until(ExpectedConditions.presenceOfElementLocated(By.id("windowButton")));
		// driver.findElement(By.Id("windpwButton")").click();

		//use javascriptexecutor for avoiding ad
	
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('windowButton').click()");
		
		Set<String> AllwindowId2 = driver.getWindowHandles();
		
		for(String window : AllwindowId2)
		{
			driver.switchTo().window(window);
			System.out.println("WindowId: "+window);
			System.out.println("Window title: "+driver.getTitle());
			System.out.println("Window Url: "+driver.getCurrentUrl());
			
		}	
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Tabs and window sucsessfully handled");
	}
	

}

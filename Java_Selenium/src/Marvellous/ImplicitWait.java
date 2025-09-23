package Marvellous;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws Exception {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		 Thread.sleep(2000);	  //At any cost it will wait for 10 second
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // this line for if there is an mistake in belows xpath. it will wait 
		                                                                   //for 30 second(coz sometime page not load) and then throw exception instead of throwing immediatly
		 
		driver.findElement(By.xpath("//textarea[@role='combobox']")).sendKeys("how stuff works");
		
		 
	  //handling auto suggestion
	   List<WebElement> Allsuggestion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	   System.out.println("Total suggestions :- " +Allsuggestion.size());
	   
	   
	   for(int i = 0; i < Allsuggestion.size(); i++)
	   {
		   
		   if(Allsuggestion.get(i).getText().equalsIgnoreCase("how stuff works podcast"))
		   {
			   Allsuggestion.get(i).click();
			   break;
		   }
	   }

	}

}

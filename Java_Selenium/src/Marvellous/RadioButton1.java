package Marvellous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();		
		//driver.findElement(By.xpath("//a[contains(role,'button']")).click();	
		
		//when we handle radio button all attributes are same except "value" attribute so we can use it
		
		//Handling radio button  1st way 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=1]")).click();  // For Female button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=2]")).click();  // For Male button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=-1]")).click(); // For custome button
		
		// if suppose there is no "value" there  
		//2nd way
		Thread.sleep(2000);
		List<WebElement> Radios = driver.findElements(By.xpath("//input[@type = 'radio']"));  // creates the list of radio buttons
		 
		//to check the size of list
		 System.out.println("Total radio buttons are "+Radios.size());  // 3
		 
		 //to check the button is selected or not
		 System.out.println(Radios.get(0).isSelected());  // false coz last selected was custome on line 32
		 
		 //to check the button is enabled to perform or not
		 System.out.println(Radios.get(1).isEnabled());  // true
		 
		 //to check the button is displayed or not
		System.out.println(Radios.get(2).isDisplayed());  // true 
		
		Thread.sleep(2000);
		Radios.get(1).click();  // male
		
	   System.out.println(Radios.get(2).isSelected());  // false
	   
	   //if the sequnece of buttons may changed sometime that time we will use text instead of buttons
	   // 3rd way
	   
	   List <WebElement> radiosText = driver.findElements(By.xpath("//*[@class = '_58mt']"));
	   // want to click on Female button now
	    String expResult = "Female";
	    
	    for(int i = 0; i < radiosText.size(); i++)
	    {
	    	if(radiosText.get(i).getText().equalsIgnoreCase(expResult))
	    	{
	    		radiosText.get(i).click();
	    	}
	    }
	    System.out.println("Female clicked successfully");  
 
		}
}
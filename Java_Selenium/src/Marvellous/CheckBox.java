package Marvellous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://designsystem.digital.gov/components/checkbox/");
		
	    Thread.sleep(2000);	
	   driver.findElement(By.xpath("//label[@text()='Booker T. Washington']")).click();
	   
	   System.out.println("clicked");

	}
}
//label[@text()='Booker T. Washington']
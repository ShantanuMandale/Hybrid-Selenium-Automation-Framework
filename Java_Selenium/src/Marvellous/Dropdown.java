package Marvellous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total dropdown values :" + birthMonth.size());
		
		//1st Way
		
		Thread.sleep(2000);
		birthMonth.get(3).click();  // Apr
		
		Thread.sleep(2000);
		birthMonth.get(11).click();  // Dec
		
		// 2nd Way
		
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select Month = new Select(bm);
		
		Thread.sleep(2000);
		Month.selectByVisibleText("Jan");  // Jan
		
		Thread.sleep(2000);
		Month.selectByValue("9");  // Sep
		
		Thread.sleep(2000);
		Month.selectByIndex(4);  // May
		
		//to check current/recent selected value
		System.out.println(Month.getFirstSelectedOption().getText());  // May
		
		
		// 3rd Way
		
		Thread.sleep(2000);
		List<WebElement> Dropdown = Month.getOptions();  // we have already 
		System.out.println("Total number of dropdown 2nd time : " + Dropdown.size());
		for(int i = 0; i < Dropdown.size(); i++)
		{
			if(Dropdown.get(i).getText().equalsIgnoreCase("Dec"));
			{
				Dropdown.get(i).click();
			}
		}
		
		// 4th Way
		
	    Thread.sleep(2000);
	    WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));  // we can also use above bm.sendKeys("Mar") coz we have already done
	    bm1.sendKeys("Mar");
	    
	    // 7th Way 
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Nov");  // simplest Way
	} 

}

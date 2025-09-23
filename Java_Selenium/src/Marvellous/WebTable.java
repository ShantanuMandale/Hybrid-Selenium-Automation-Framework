package Marvellous;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable { 

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//webTable url
		driver.get("https://money.rediff.com/gainers");
		
		
		
		//create list of all companies
		List<WebElement> AllCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("The Total Number of companies: " +AllCompanies.size());
		
		
		//create a list of all companies current price
		
		List<WebElement> CurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("The Total Number of companies: " +CurrentPrice.size());
		
		//fetch company and their current price
		
		String ExpResult = "Sai Life Science";
		for(int i = 0; i < AllCompanies.size(); i++)
		{
			if(AllCompanies.get(i).getText().equalsIgnoreCase(ExpResult))
			{
				System.out.println(AllCompanies.get(i).getText() + " == " + CurrentPrice.get(i).getText());   // Ram Info == 122.54
				AllCompanies.get(i).click();
				System.out.println(driver.getTitle());
				break;
				
			}
		}
	}

}

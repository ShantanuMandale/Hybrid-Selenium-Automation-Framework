package Marvellous;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logg4JLogging {

	public static void main(String[] args) {
		
		//Create logger instance
		Logger logger = Logger.getLogger("Logg4JLogging"); // use log4j for this class(Meaning)
		logger.info("Instance successfullt created ");  // instead of syso
		
		// configure log4j properties file
		PropertyConfigurator.configure("C:\\Users\\Dell\\eclipse-workspace\\Java_Selenium\\Repository\\Log4j.properties");
		
		//open browser instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		logger.info("opened browser instance");
		
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		logger.info("implicite wait given");
		//launch application
		driver.get("https://www.facebook.com/");
		logger.info("application opened");
		
		//WebElement is displayed or not
		try {
			driver.findElement(By.id("emails")).isDisplayed(); //intentionally make mistake
			logger.info("Element Found");
		} catch (Exception e) {
			logger.info("Element not found");
		}
	}
	
}

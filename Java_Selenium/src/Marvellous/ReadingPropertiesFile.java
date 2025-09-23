// We have created properties file in repository folder check it

package Marvellous;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws Exception {
		
	// (1) specify the location of config properties file
		
		File src1 = new File("C:\\Users\\Dell\\eclipse-workspace\\Java_Selenium\\Repository\\config.properties");
		
		//Create a FileinputStream class object to load file
		FileInputStream fis1 = new FileInputStream(src1);
		//Create a object of Properties class object
		Properties pro1 = new Properties();
		pro1.load(fis1);
		
		
	// (2) specify the location of Locators properties file
			
			File src2 = new File("C:\\Users\\Dell\\eclipse-workspace\\Java_Selenium\\Repository\\Locators.properties");
			
			//Create a FileinputStream class object to load file
			FileInputStream fis2 = new FileInputStream(src2);
			//Create a object of Properties class object
			Properties pro2 = new Properties();
			pro2.load(fis2);
			
			
	// (3) specify the location of TestData properties file
				
				File src3 = new File("C:\\Users\\Dell\\eclipse-workspace\\Java_Selenium\\Repository\\TestData.properties");
				
				//Create a FileinputStream class object to load file
				FileInputStream fis3 = new FileInputStream(src3);
				//Create a object of Properties class object
				Properties pro3 = new Properties();
				pro3.load(fis3);
				
	//Now Normal program begin			
				System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath"));
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//instead of url we have just pass file
				driver.get(pro1.getProperty("URL1"));  // here we pass stored url from config properties file
				//getProperty() method will accept key return value of that key
				
			    Thread.sleep(2000);
				driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
				Thread.sleep(2000);
				driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
				
				 Thread.sleep(2000);
				 driver.close();
				
				

	}

}

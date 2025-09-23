package Marvellous;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//webTable url

		driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_f02ed1e5-6a49-45c9-99fe-13dd00b4c5de_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=ZRQ4DKH28K8J");
	
		//create a reference of Electronics webElement
		
		WebElement Electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		//mouse simulation using 'Action' class 
		Actions act = new Actions(driver);
		
		//mouse hover to electronics
		Thread.sleep(2000);
		act.moveToElement(Electro).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Samsung']")).click();
		
		//using keyboard
		Thread.sleep(2000);
		WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(men, Keys.ENTER).build().perform();
		System.out.println("men option clicked");
		
		//right click on webpage
	    Thread.sleep(2000);
	    act.contextClick(Electro).build().perform();
	}

}

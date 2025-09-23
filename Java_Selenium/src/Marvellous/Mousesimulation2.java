package Marvellous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousesimulation2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//webTable url
		driver.get("https://jqueryui.com/droppable/");
		
		//Switching to fame
		driver.switchTo().frame(0);
		
		//Draggable webelement
		WebElement drag = driver.findElement(By.id("draggable"));
		
		//Droppable webelement
		WebElement drop = driver.findElement(By.id("droppable"));
		
		//drag and drop using Action class
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();

	}

}

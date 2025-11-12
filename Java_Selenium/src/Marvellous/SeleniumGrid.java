package Marvellous;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumGrid {

    @DataProvider(parallel = true)
    public Object[][] sendData() {
        Object arr[][] = new Object[2][2];

        arr[0][0] = "Email_1";
        arr[0][1] = "chrome";

        arr[1][0] = "Email_2";
        arr[1][1] = "chrome";

        return arr;
    }

    @Test(dataProvider = "sendData")
    public void Login(String Username, String BrowserName) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        if (BrowserName.equalsIgnoreCase("chrome")) {
            cap = DesiredCapabilities.chrome();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.WINDOWS);
        }
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys(Username);
        
        
    }
}

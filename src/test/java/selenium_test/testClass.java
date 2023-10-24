package selenium_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class testClass {

    @Test
   public void demo()
   {
              WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
options.setBinary(System.getenv("CHROME_BIN"));
       options.addArguments("--headless");
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
WebDriver driver = new ChromeDriver(options);
        
        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement searchInput = driver.findElement(By.xpath("//*[@id='email']"));
        searchInput.sendKeys("testuser");
        
        System.out.println("facebook");
       System.out.println("hello");
        driver.quit();
       System.out.println("hello");

   }
}

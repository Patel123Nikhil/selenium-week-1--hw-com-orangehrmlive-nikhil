package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com";
        System.setProperty("webdriver.gheko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Give the implicit time to driver]
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        //Get current URL
        System.out.println("Current page: " + driver.getCurrentUrl());
        //Get page source
        System.out.println("Page source: " + driver.getPageSource());
        //Find the user field
        WebElement userFiled = driver.findElement(By.name("username"));
        //Type the username in user field
        userFiled.sendKeys("Admin");
        //Find the password field
        WebElement passwordFiled = driver.findElement(By.name("password"));
        //Type the password in password field
        passwordFiled.sendKeys("admin123");
        //Close the browser
        driver.quit();

    }
}

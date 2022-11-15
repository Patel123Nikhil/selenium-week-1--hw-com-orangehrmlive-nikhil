package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Give the implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        //Get current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Get pge source
        System.out.println("Page source: " + driver.getPageSource());
        //Find the username field
        WebElement userField = driver.findElement(By.name("username"));
        //Type the username in username field
        userField.sendKeys("Admin");
        //Find the password field
        WebElement passwordField = driver.findElement(By.name("password"));
        //Type the password in password field
        passwordField.sendKeys("Admin123");
        //Close the browser
        driver.quit();


    }

}

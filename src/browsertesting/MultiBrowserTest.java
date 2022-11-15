package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("FireFox")) {
            System.setProperty("webdriver.gheko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            driver = new EdgeDriver();

        }else {
            System.out.println("Wrong Browser Name");

        }
        driver.get(baseUrl);
        //Give the implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        //Get the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Get the source
        System.out.println(" Page Source: " + driver.getPageSource());
        //Find the user field
        WebElement userFiled = driver.findElement(By.name("username"));
        //Type the username in user field
        userFiled.sendKeys("Admin");
        //Find the passowrd field
        WebElement passwordField = driver.findElement(By.name("password"));
        //Type the password in password field
        passwordField.sendKeys("admin123");

    }
    }



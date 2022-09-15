package com.Etsy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public static Properties prop;
    public static WebDriver driver;

    @BeforeTest
    public void loadConfig() {

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    System.getProperty("user.dir") + "/src/main/resources/config.properties");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void launchApplication() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
                "/src/main/java/com/Etsy/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //launch the URL
        driver.get(prop.getProperty("url"));
    }
}

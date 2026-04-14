package DZ.DemoQA.Tests;
import org.junit.jupiter.api.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v144.tethering.model.Accepted;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    @BeforeEach
    public void setup () {
        WebDriverManager.chromedriver().setup();

        this.webDriver = new ChromeDriver();
        this.webDriver.manage().window().maximize();
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(3));
    }
    public void openURL(String URL){
        webDriver.get(URL);
    }

//    @AfterEach
//    public void closeBrowser(){
//        webDriver.quit();
//    }
}

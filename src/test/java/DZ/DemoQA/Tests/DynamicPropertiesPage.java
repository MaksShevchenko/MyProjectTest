package DZ.DemoQA.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage {
    WebDriver webDriver;
    WebDriverWait webDriverWait;

    By willEnableButtonLocator = By.xpath("//button[@id='enableAfter']");

}

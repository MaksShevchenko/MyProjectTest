package DZ.DemoQA.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {
    WebDriver webDriver;
    WebDriverWait webDriverWait;

    By doubleClickButtonLocator = By.xpath("//button[@id='doubleClickBtn']");
    By rightClickButtonLocator = By.xpath("//button[@id='rightClickBtn']");

    public ButtonsPage(WebDriver webDriver, WebDriverWait webDriverWait){
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
    }

    public void doubleClickCheck(){
       WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(doubleClickButtonLocator));
        new Actions(webDriver).doubleClick(webElement).perform();

    }
    public void rightClickChech(){
        WebElement webElement = webDriver.findElement(rightClickButtonLocator);
        new Actions(webDriver).contextClick(webElement).perform();
    }
}

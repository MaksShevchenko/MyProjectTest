package DZ.DemoQA.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {
    WebDriver webDriver;

    By titleLocator = By.xpath("//h1[@class='text-center']");
    By yesButtonLocator = By.xpath("//input[@id='yesRadio']");
    By impressiveButtonLocator = By.xpath("//input[@id='impressiveRadio']");
    By noButtonLocator = By.xpath("//input[@id='noRadio']");
    By selectedLocator = By.xpath("//p[@class='mt-3']");
    By outputselectedLocator = By.xpath("//span[@class='text-success']");
    public RadioButtonPage(WebDriver webDriver){
        this.webDriver= webDriver;
    }

    public void isDisplayedTitle(){
        WebElement webElement = webDriver.findElement(titleLocator);
        webElement.isDisplayed();
    }
    public void yesButtonCheck(){
        WebElement webElement = webDriver.findElement(yesButtonLocator);
        webElement.click();
    }

    public void impressiveButtonCheck(){
        WebElement webElement = webDriver.findElement(impressiveButtonLocator);
        webElement.click();
    }
    public void noButtonIsDisplayed(){
        WebElement webElement= webDriver.findElement(noButtonLocator);
        webElement.isDisplayed();
    }
    public  String  selectedCheck(){
        WebElement webElement = webDriver.findElement(selectedLocator);
        return webElement.getText();
    }
    public String getOutputSelectedLocator(){
        return webDriver.findElement(outputselectedLocator).getText();
    }

}

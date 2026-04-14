package DZ.DemoQA.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeFormPage {
    WebDriver webDriver;
    WebDriverWait webDriverWait;
    By firstNameLocator = By.xpath("//input[@id='firstName']");
    By lastNameLocator = By.xpath("//input[@id='lastName']");
    By emailLocator = By.xpath("//input[@id='userEmail']");
    By genderLocator = By.xpath("//input[@id='gender-radio-1']");
    By mobileLocator = By.xpath("//input[@id='userNumber']");
    By dateOfBirthInputLocator = By.xpath("//input[@id='dateOfBirthInput']");


    public PracticeFormPage(WebDriver webDriver, WebDriverWait webDriverWait){
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
    }

    public void setFirstNameLocator(String message){
        WebElement webElement = webDriver.findElement(firstNameLocator);
        webElement.sendKeys(message);
    }
    public void setLastNameLocator(String message){
        WebElement webElement = webDriver.findElement(lastNameLocator);
        webElement.sendKeys(message);
    }
    public void setEmailLocator(String message){
        WebElement webElement = webDriver.findElement(emailLocator);
        webElement.sendKeys(message);
    }

}

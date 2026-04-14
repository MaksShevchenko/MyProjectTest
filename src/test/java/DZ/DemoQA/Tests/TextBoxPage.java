package DZ.DemoQA.Tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.PrivateKey;

public class TextBoxPage {
    WebDriver webDriver;

    By logoLocator = By.xpath("//img[@src='/assets/Toolsqa-DZdwt2ul.jpg']");
    By nameLocator = By.xpath("//input[@id='userName']");
    By emailLocator = By.xpath("//input[@id='userEmail']");
    By currentAddressLocator = By.xpath("//textarea[@id='currentAddress']");
    By permanentAddressLocator = By.xpath("//textarea[@id='permanentAddress']");
    By outputNameLocator = By.xpath("//p[@id='name']");
    By buttonSubmitLocator = By.xpath("//button[@id='submit']");
    By outemailLocator = By.xpath("//p[@id='email']");
    By outputCurrentAddressLocator = By.xpath("//p[@id='currentAddress']");
    By outputPermanentAddressLocator = By.xpath("//p[@id='permanentAddress']");


    public TextBoxPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }


    public void setNameLocator(String message){
        WebElement webElement = webDriver.findElement(nameLocator);
        webElement.sendKeys(message);
    }
    public void setEmailLocator(String message){
        WebElement webElement = webDriver.findElement(emailLocator);
        webElement.sendKeys(message);
    }
    public void setCurrentAddressLocator(String message){
        WebElement webElement = webDriver.findElement(currentAddressLocator);
        webElement.sendKeys(message);
    }
    public void setPermanentAddressLocator(String message){
        WebElement webElement = webDriver.findElement(permanentAddressLocator);
        webElement.sendKeys(message);
    }
    public void clickButtonLocator(){
        WebElement webElement = webDriver.findElement(buttonSubmitLocator);
        webElement.click();
    }
    public void isDisplayed(){
        WebElement webElement = webDriver.findElement(outputNameLocator);
    }
    public void setOutemailLocator(String message){
        WebElement webElement = webDriver.findElement(outemailLocator);
        webElement.sendKeys(message);
    }
    public void setOutputNameLocator(String message){
        WebElement webElement= webDriver.findElement(outputNameLocator);
        webElement.sendKeys(message);
    }
    public void setOutputCurrentAddressLocator( String message){
        WebElement webElement = webDriver.findElement(outputCurrentAddressLocator);
        webElement.sendKeys(message);
    }
    public void setOutputPermanentAddressLocator(String message){
        WebElement webElement = webDriver.findElement(outputPermanentAddressLocator);
        webElement.sendKeys(message);
    }
//Методы для проверки в тестах
    public boolean isLogoDisplayed() {
        return webDriver.findElement(logoLocator).isDisplayed();
    }

    public String getOutputName() {
        return webDriver.findElement(outputNameLocator).getText();
    }

    public String getOutputEmail() {
        return webDriver.findElement(outemailLocator).getText();
    }

    public String getOutputCurrentAddress() {
        return webDriver.findElement(outputCurrentAddressLocator).getText();
    }

    public String getOutputPermanentAddress() {
        return webDriver.findElement(outputPermanentAddressLocator).getText();
    }

}
//pattern Page Object
//TextBoxTest новый класс и там внедряем тесты


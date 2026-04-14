package DZ.DemoQA.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {
    WebDriver webDriver;

    By titleLocator = By.xpath("//h1[@class='text-center']");
    By buttonPlusLocator = By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']");
    By buttonMinusLocator = By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_open']");
    By selectedLocator = By.xpath("//span[@class='rc-tree-checkbox']");
    By outputSelectedLocator = By.xpath("//div[@id='result']");
    public CheckBoxPage (WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void clickButtonPlus(){
        WebElement webElement = webDriver.findElement(buttonPlusLocator);
        webElement.click();
    }
    public void clickButtonMinus(){
        WebElement webElement = webDriver.findElement(buttonMinusLocator);
        webElement.click();
    }
    public void isDisplayedTitle (){
        WebElement webElement = webDriver.findElement(titleLocator);
        webElement.isDisplayed();
    }
    public void clickSelectedLocator(){
        WebElement webElement = webDriver.findElement(selectedLocator);
        webElement.click();
    }
    public void outputSelectedLocator(){
        WebElement webElement = webDriver.findElement(outputSelectedLocator);
        webElement.isDisplayed();
    }
}

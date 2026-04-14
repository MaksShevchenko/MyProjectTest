package DZ.DemoQA.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage {
    WebDriver webDriver;

    By addButtonLocator = By.xpath("//button[@id='addNewRecordButton']");
    By titleRegistrationLocator = By.xpath("//div[@class='modal-title h4']");
    By nameLocator = By.xpath("//input[@id='firstName']");
    By lastNameLocator = By.xpath("//input[@id='lastName']");
    By emailLocator = By.xpath("//input[@id='userEmail']");
    By ageLocator = By.xpath("//input[@id='age']");
    By salaryLocator = By.xpath("//input[@id='salary']");
    By departmentLocator = By.xpath("//input[@id='department']");
    By submitButtonLocator = By.xpath("//button[@type='submit']");
    By closeButtonLocator = By.xpath("//button[@class='btn-close']");

    By editButtonLocator = By.xpath("//span[@id='edit-record-1']");
    By deleteButtonLocator = By.xpath("//span[@id='delete-record-1']");

    By showButtonLocator = By.xpath("//select[@class='form-control']");
    By show10ButtonLocator = By.xpath("//option[@value='10']");
    By show20ButtonLocator = By.xpath("//option[@value='20']");
    By show30ButtonLocator = By.xpath("//option[@value='30']");
    By show40ButtonLocator = By.xpath("//option[@value='40']");
    By show50ButtonLocator = By.xpath("//option[@value='50']");

    By seachLocator = By.xpath("//input[@id='searchBox']");
    public WebTablesPage (WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void addClickCheck(){
        WebElement webElement = webDriver.findElement(addButtonLocator);
        webElement.click();
    }
    public void titleRegistrationCheck (){
        WebElement webElement = webDriver.findElement(titleRegistrationLocator);
        webElement.isDisplayed();
    }
    public void setNameLocator(String message){
        WebElement webElement = webDriver.findElement(nameLocator);
        webElement.sendKeys(message);
    }
    public void setLastNameLocator(String message){
        WebElement webElement = webDriver.findElement(lastNameLocator);
        webElement.sendKeys(message);
    }
    public void setemailLocator(String message){
        WebElement webElement = webDriver.findElement(emailLocator);
        webElement.sendKeys(message);
    }
    public void setAgeLocator(String message){
        WebElement webElement = webDriver.findElement(ageLocator);
        webElement.sendKeys(message);
    }
    public void setSalaryLocator(String message){
        WebElement webElement = webDriver.findElement(salaryLocator);
        webElement.sendKeys(message);
    }
    public void setDepartmentLocator(String message){
        WebElement webElement = webDriver.findElement(departmentLocator);
        webElement.sendKeys(message);
    }
    public void closeButtonCheck(){
        WebElement webElement = webDriver.findElement(closeButtonLocator);
        webElement.click();
    }
    public void submitButtonCheck(){
        WebElement webElement = webDriver.findElement(submitButtonLocator);
        webElement.click();
    }
    public void editButtonCheck(){
        WebElement webElement = webDriver.findElement(editButtonLocator);
        webElement.click();
    }
    public void deleteButtonCheck(){
        WebElement webElement = webDriver.findElement(deleteButtonLocator);
        webElement.click();
    }
    public void show10ButtonCheck(){
        WebElement webElement = webDriver.findElement(show10ButtonLocator);
        webElement.click();
    }
    public void show20ButtonCheck(){
        WebElement webElement = webDriver.findElement(show20ButtonLocator);
        webElement.click();
    }
    public void show30ButtonCheck(){
        WebElement webElement = webDriver.findElement(show30ButtonLocator);
        webElement.click();
    }
    public void show40ButtonCheck(){
        WebElement webElement = webDriver.findElement(show40ButtonLocator);
        webElement.click();
    }
    public void show50ButtonCheck(){
        WebElement webElement = webDriver.findElement(show50ButtonLocator);
        webElement.click();
    }
    public void showButtonCheck(){
        WebElement webElement = webDriver.findElement(showButtonLocator);
        webElement.click();
    }
    public void searchCheck(String message){
        WebElement webElement = webDriver.findElement(seachLocator);
        webElement.sendKeys(message);
    }

}

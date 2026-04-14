//package SeleniumTests;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class BaseTest {
//    By fullnamelocator = By.xpath("//input[@id='userName']");
//    By locator2 = By.xpath("//textarea[@id='currentAddress']");
//    By buttonlocator = By.xpath("//button[@id='submit']");
//    By finalName = By.xpath("//p[@id='name']");
//    private WebDriver webDriver;
//    @BeforeEach
//    public void setup (){
//        WebDriverManager.chromedriver();
//
//        this.webDriver = new ChromeDriver();
//
//    }
//    @Test
//    public void myFirstTest (){
//        webDriver.get("https://demoqa.com/text-box");
//        WebElement fullnameelement = webDriver.findElement(fullnamelocator);
//        WebElement fulllocator2 = webDriver.findElement(locator2);
//        fulllocator2.sendKeys("Moskva");
//        fullnameelement.sendKeys("Максим Максимович");
//        WebElement buttonSub = webDriver.findElement(buttonlocator);
//        buttonSub.click();
//        WebElement proverkaName = webDriver.findElement(finalName);
//        Assertions.assertTrue(proverkaName.isDisplayed());
//        Assertions.assertEquals(proverkaName.getText(),"Name:Максим Максимович");
//
//
//    }
//}
// ДЗ параметризированные тесты в JUnit , виды как их можно использовать


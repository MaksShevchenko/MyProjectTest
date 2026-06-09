package DZ.DemoQA.Tests.ScrollGit;

import DZ.DemoQA.Tests.BaseTest;
import DZ.DemoQA.Tests.Links;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitTest extends BaseTest {
    GitPage gitPage;
    @BeforeEach
    @Override
    public void setup(){
        super.setup();
        gitPage = new GitPage(webDriver);
        openURL(Links.GitURL);

    }
    @Test
    public void scrollGitTest () {
//        Actions actions = new Actions(webDriver);
//        Thread.sleep(3000);
//        actions.scrollByAmount(0, 500).perform();
//        Thread.sleep(3000);
//        actions.scrollByAmount(0, 500).perform();
//        Thread.sleep(3000);
//        actions.scrollByAmount(0, 500).perform();
        myScrollToElement();
    }
    By classLocator = By.xpath("//footer[@class='footer tmp-pt-7 tmp-pb-6 f6 color-fg-muted color-border-subtle p-responsive']");
    public void myScrollToElement(){
        WebElement element = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(classLocator));
        //((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();", element);
        //((JavascriptExecutor)webDriver).executeScript("arguments[0].click();", element); //клик
        //((JavascriptExecutor)webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight);"); // скрол в конец страницы


    }
}

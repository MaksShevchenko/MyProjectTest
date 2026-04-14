package DZ.DemoQA.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonTest extends BaseTest{
    ButtonsPage buttonsPage;

    @BeforeEach
    @Override
    public void setup (){
        super.setup();
        buttonsPage = new ButtonsPage(webDriver, webDriverWait);
        openURL(Links.ButtonsURL);
    }
//    @Test
//    public void doubleCleckTest() throws InterruptedException {
//        for (int i = 0; i <= 5; i++){
//            buttonsPage.doubleClickCheck();
//            Thread.sleep(500);
//            i++;
//        }
//    }
    @Test
    public void doubleClickTest() {
        buttonsPage.doubleClickCheck();
    }

}
package DZ.DemoQA.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CheckBoxTest extends BaseTest{
    CheckBoxPage checkBoxPage;

    @BeforeEach
    @Override
    public void setup() {
        super.setup();
        checkBoxPage = new CheckBoxPage(webDriver);
        openURL(Links.CheckBoxURL);
    }
    @Test
    public void isDisplayedButtonPlus() throws InterruptedException {
        checkBoxPage.isDisplayedTitle();
        for (int i = 0; i <= 6; i++){
            checkBoxPage.clickButtonPlus();
            Thread.sleep(500);
            i++;
        }
//        checkBoxPage.clickSelectedLocator();
//        checkBoxPage.clickButtonMinus();
//        checkBoxPage.outputSelectedLocator();
    }
}

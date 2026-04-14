package DZ.DemoQA.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RadioButtonTest extends BaseTest{
    RadioButtonPage radioButtonPage;

    @BeforeEach
    @Override
    public void setup(){
        super.setup();
        radioButtonPage = new RadioButtonPage(webDriver);
        openURL(Links.RadioButtonURL);
    }

    @Test
    public void radioButtonPageTest(){
        radioButtonPage.isDisplayedTitle();
        radioButtonPage.yesButtonCheck();
        radioButtonPage.impressiveButtonCheck();
        radioButtonPage.noButtonIsDisplayed();
        Assertions.assertEquals("You have selected Impressive",radioButtonPage.selectedCheck(),"Error Selected");
        Assertions.assertEquals("Impressive", radioButtonPage.getOutputSelectedLocator(), "Error Impressive");
    }
}

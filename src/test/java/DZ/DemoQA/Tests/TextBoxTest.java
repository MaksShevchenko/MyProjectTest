package DZ.DemoQA.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TextBoxTest extends BaseTest{
    TextBoxPage textBoxPage ;

    @BeforeEach
    @Override
    public void setup() {
        super.setup();
        textBoxPage = new TextBoxPage(webDriver);
        openURL(Links.baseURL);
    }
    @Test
    public void shouldReturn_autorization(){
        textBoxPage.setNameLocator("Иван");
        textBoxPage.setEmailLocator("123@gmail.com");
        textBoxPage.setCurrentAddressLocator("Moscow, 3");
        textBoxPage.setPermanentAddressLocator("Tula, 1");
        textBoxPage.clickButtonLocator();
        Assertions.assertEquals("Name:Иван", textBoxPage.getOutputName());
    }
}
//Scroll и DragAndDrop

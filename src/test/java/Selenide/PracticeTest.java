package Selenide;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class PracticeTest extends PracticeFromPage {
    @Test
    public void myFirstTest(){
        open("https://demoqa.com/text-box");
        setFullNameElement("Petya");
        setEmailElement("123@gmail.com");
    }
    @BeforeEach
    public void setup(){
        Configuration.holdBrowserOpen = true;
    }
}
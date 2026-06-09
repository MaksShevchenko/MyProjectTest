package Selenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PracticeFromPage {
    SelenideElement fullNameElement = $("input[id=userName]");
    SelenideElement emailElement = $("input[id=userEmail]");
    public void setFullNameElement(String fullName){
        fullNameElement.setValue(fullName);
        fullNameElement.hover();
    }
    public void setEmailElement(String email){
        emailElement.scrollTo();
        emailElement.setValue(email);
    }
}


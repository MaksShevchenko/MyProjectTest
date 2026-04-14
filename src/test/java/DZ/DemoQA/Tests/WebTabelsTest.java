package DZ.DemoQA.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WebTabelsTest extends BaseTest{
    WebTablesPage webTablesPage;

    @BeforeEach
    @Override
    public void setup() {
        super.setup();
        webTablesPage = new WebTablesPage(webDriver);
        openURL(Links.WebTablesURL);
    }
    //Всплывающее окно
    @Test
    public void webTablesWindowTest () throws InterruptedException {
        webTablesPage.addClickCheck();
        webTablesPage.titleRegistrationCheck();
        webTablesPage.setNameLocator("Вася");
        webTablesPage.setLastNameLocator("Васильев");
        webTablesPage.setemailLocator("123@gmail.com");
        webTablesPage.setAgeLocator("19");
        webTablesPage.setSalaryLocator("90000");
        webTablesPage.setDepartmentLocator("HR");
        //webTablesPage.closeButtonCheck();
        webTablesPage.submitButtonCheck();
        webTablesPage.editButtonCheck();
        Thread.sleep(3000);
        webTablesPage.closeButtonCheck();
//        Thread.sleep(2000);
//        webTablesPage.deleteButtonCheck();
//        webTablesPage.submitButtonCheck();
//        webTablesPage.show30ButtonCheck();
//        webTablesPage.setShow20ButtonLocator();
//        webTablesPage.setShow30ButtonLocator();
//        webTablesPage.setShow40ButtonLocator();
//        webTablesPage.setShow50ButtonLocator();
    }
    @Test
    public void searchingTest (){
        webTablesPage.searchCheck("Alden");
    }

}

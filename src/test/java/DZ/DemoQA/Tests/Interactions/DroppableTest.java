package DZ.DemoQA.Tests.Interactions;

import DZ.DemoQA.Tests.BaseTest;
import DZ.DemoQA.Tests.Links;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DroppableTest extends BaseTest {
    DroppablePage droppablePage;

    @BeforeEach
    @Override
    public void setup(){
        super.setup();
        droppablePage = new DroppablePage(webDriver);
        openURL(Links.DroppableURL);
    }
//    @Test
//    public void DragAndDropTest() throws InterruptedException {
//        WebElement dragMeLocator = webDriver.findElement(By.xpath("//div[@id='draggable']"));
//        WebElement dropLocator = webDriver.findElement(By.xpath("//div[@id='droppable']"));
//        Thread.sleep(3000);
//        Actions actions = new Actions(webDriver);
//        actions.dragAndDrop(dragMeLocator,dropLocator).perform();
//
//        String dropText = dropLocator.getText();
//        Assertions.assertEquals("Dropped!",dropText);
//
//    }
    @Test
    public void DragAndDropTest() throws InterruptedException {
        droppablePage.dragAndDropCheck();

    }
}

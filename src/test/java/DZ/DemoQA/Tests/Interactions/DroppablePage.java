package DZ.DemoQA.Tests.Interactions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DroppablePage {
    WebDriver webDriver;

    By dragMeLocator = By.xpath("//div[@id='draggable']");
    By dropLocator = By.xpath("//div[@id='droppable']");

    public DroppablePage (WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void dragAndDropCheck () throws InterruptedException {
//        WebElement drag = webDriver.findElement(dropLocator);
//        WebElement drop = webDriver.findElement(dragMeLocator);
//        Thread.sleep(3000);
//        new Actions(webDriver).dragAndDrop(drag, drop).perform();
        WebElement dragMeLocator = webDriver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropLocator = webDriver.findElement(By.xpath("//div[@id='droppable']"));

        new Actions(webDriver).dragAndDrop(dropLocator,dragMeLocator).perform();

    }

}

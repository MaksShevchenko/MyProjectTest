package DZ.DemoQA.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class UploadDownload {
    @Test
    public void uploadFileTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/upload-download");
        Thread.sleep(1000);

        String filePath = Paths.get("test-upload.txt")
                .toAbsolutePath()
                .toString();

        driver.findElement(By.id("uploadFile")).sendKeys(filePath);
        Thread.sleep(2000);

        driver.quit();
    }
}

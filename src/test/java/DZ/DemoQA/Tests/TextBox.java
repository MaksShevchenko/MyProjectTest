package DZ.DemoQA.Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

//public class TextBox extends BaseTest{
//    By namelocator =By.xpath("//input[@id='userName']");
//    By buttonlocator = By.xpath("//button[@id='submit']");
//
//
//        @Test
//        public void textBox() {
//            webDriver.get("https://demoqa.com/text-box");
//
//            //заголовок страницы ---------------------------
//            String expectedTitle = "demosite";
//            String actualTitle = webDriver.getTitle();
//            Assertions.assertEquals(expectedTitle, actualTitle, "Заголовок не правильный");
//            //Logo -----------------------------------------
//            WebElement logoLocator = webDriver.findElement(By.xpath("//img[@src='/assets/Toolsqa-DZdwt2ul.jpg']"));
//            Assertions.assertTrue(logoLocator.isDisplayed());
//            //Full name поле -------------------------------
//            WebElement myNameLocator = webDriver.findElement(namelocator);
//            myNameLocator.sendKeys("Василий Васильевич");
//            //Email ----------------------------------------
//            WebElement myEmailLocator = webDriver.findElement(By.xpath("//input[@id='userEmail']"));
//            myEmailLocator.sendKeys("test@gmail.com");
//            //Current Address ------------------------------
//            WebElement myCurrentAddress = webDriver.findElement(By.xpath("//textarea[@id='currentAddress']"));
//            myCurrentAddress.sendKeys("Moscow, 3");
//            //Permanent Address ------------------------------
//            WebElement myPermanentAddress = webDriver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
//            myPermanentAddress.sendKeys("Tula, 1");
//            //Submit button click --------------------------
//            WebElement buttonSubmit = webDriver.findElement(buttonlocator);
//            buttonSubmit.click();
//            //Проверка имени
//            WebElement outputName = webDriver.findElement(By.xpath("//p[@id='name']"));
//            Assertions.assertEquals("Name:Василий Васильевич",outputName.getText(), "Имя не совпадает");
//            //Проверка почты
//            WebElement outputEmail = webDriver.findElement((By.xpath("//p[@id='email']")));
//            Assertions.assertEquals("Email:test@gmail.com",outputEmail.getText(), "Почта не совпадает");
//            //Проверка Current Address
//            WebElement outputCurrentAddress = webDriver.findElement((By.xpath("//p[@id='currentAddress']")));
//            Assertions.assertEquals("Current Address :Moscow, 3",outputCurrentAddress.getText(), "Current Адрес не совпадает");
//            //Проверка Permanent Address
//            WebElement outputPermanentAddress = webDriver.findElement((By.xpath("//p[@id='permanentAddress']")));
//            Assertions.assertEquals("Permananet Address :Tula, 1",outputPermanentAddress.getText(), "Permanent Адрес не совпадает");
//        }
//
//        @Test
//        public void checkBox() {
//            webDriver.get("https://demoqa.com/checkbox");
//            wait.until(ExpectedConditions.visibilityOfElementLocated());
//            // Проверяем ветку +
//            WebElement buttonTree1 = webDriver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']"));
//            buttonTree1.click();
//            Thread.sleep(500);
//            WebElement buttonTree2 = webDriver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']"));
//            buttonTree2.click();
//            Thread.sleep(500);
//            WebElement buttonTree3 = webDriver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']"));
//            buttonTree3.click();
//            Thread.sleep(500);
//            WebElement buttonTree4 = webDriver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']"));
//            buttonTree4.click();
//            Thread.sleep(500);
//            WebElement buttonTree5 = webDriver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']"));
//            buttonTree5.click();
//            Thread.sleep(500);
//            WebElement buttonTree6 = webDriver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_close']"));
//            buttonTree6.click();
////            // Проверяем ветку -
////            Thread.sleep(1000);
////            WebElement buttonTree7 = webDriver.findElement(By.xpath("//span[@class='rc-tree-switcher rc-tree-switcher_open']"));
////            buttonTree7.click();
//            //Проверяем check box
//            Thread.sleep(1000);
//            WebElement checkBox = webDriver.findElement(By.xpath("//span[@class='rc-tree-checkbox']"));
//            checkBox.click();
//            //Проверяем результат selected
//            WebElement selectedCheckBox = webDriver.findElement(By.xpath("//div[@class='rc-tree']"));
//            selectedCheckBox.isDisplayed();
//            //Проверка заголовка tree switcher Home
//            WebElement treeTitle = webDriver.findElement(By.xpath("//span[@class='rc-tree-title']"));
//            Assertions.assertEquals("Home", treeTitle.getText(), "Неверный заголовок tree-switcher");
//        }
//
//        @Test
//        public void radioButton() throws InterruptedException {
//            webDriver.get("https://demoqa.com/radio-button");
//            Thread.sleep(3000);
//            WebElement yesButton = webDriver.findElement(By.xpath("//input[@id='yesRadio']"));
//            yesButton.click();
//            Thread.sleep(2000);
//            WebElement impressiveButton = webDriver.findElement(By.xpath("//input[@id='impressiveRadio']"));
//            impressiveButton.click();
//            WebElement selected = webDriver.findElement(By.xpath("//span[@class='text-success']"));
//            Assertions.assertEquals("Impressive", selected.getText(), "Error select");
//
//        }
//
//
//    }


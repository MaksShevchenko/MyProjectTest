package DZ.DemoQA.Tests.ScrollGit;

import DZ.DemoQA.Tests.BaseTest;
import DZ.DemoQA.Tests.Links;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GitTest extends BaseTest {
    GitPage gitPage;
    @BeforeEach
    @Override
    public void setup(){
        super.setup();
        gitPage = new GitPage(webDriver);
        openURL(Links.GitURL);
    }
    @Test
    public void scrollGitTest () throws InterruptedException {
        Actions actions = new Actions(webDriver);
        Thread.sleep(3000);
        actions.scrollByAmount(0, 500).perform();
        Thread.sleep(3000);
        actions.scrollByAmount(0, 500).perform();
        Thread.sleep(3000);
        actions.scrollByAmount(0, 500).perform();
    }
}

package DZ.DemoQA.Tests;

import com.github.dockerjava.api.model.Link;
import org.junit.jupiter.api.BeforeEach;

public class PracticeFormTest extends BaseTest{
    PracticeFormPage practiceFormPage;

    @BeforeEach
    @Override
    public void setup(){
        super.setup();
        practiceFormPage = new PracticeFormPage(webDriver, webDriverWait);
        openURL(Links.PracticeFormURL);
    }
}
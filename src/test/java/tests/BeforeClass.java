package tests;

import steps.CompareSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by rb on 19.01.15.
 */
public class BeforeClass {

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver driver;
    @Steps
    public CompareSteps compare;

    @Before
    public void myTest() throws Exception {
        System.setProperty("webdriver.chrome.driver", getClass().getResource("/chromedriver").getPath());
        compare.start_browser();
        driver.manage().window().maximize();
    }

    @After
    public void close() throws IOException {
        driver.close();
    }

}

package Tests;

import Steps.CompareSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.findby.By;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

/**
 * Created by rb on 19.01.15.
 */
public class BeforeClass {

    @Managed(uniqueSession = true, driver = "firefox")
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

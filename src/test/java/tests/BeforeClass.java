package tests;

import org.junit.Assert;
import steps.CompareSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import static org.hamcrest.Matchers.is;
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

    public void assertTitle() {
        Assert.assertThat(compare.getTitle(), is("Видеокарты GeForce Palit - Интернет магазин Rozetka.ua | Видеокарты NVidia Palit в Киеве, Харькове, Донецке, Одессе, Львове: цена, отзывы, продажа, купить оптом видеокарты palit - интернет-магазин Rozetka.com.ua:"));
    }

}

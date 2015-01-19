package Pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 20000;

    @FindBy(xpath = "//ul[@id='sort_producer']/li[7]/label/a/span")
    private WebElement addFilter;

    @FindBy(xpath = "//*[@id=\"block_with_goods\"]/div[1]/div[1]/div[2]/div[1]/div/div/div[5]/div[1]/label/span")
    private WebElement selectSecondCardToCompare;

    @FindBy(xpath = "//*[@id=\"block_with_goods\"]/div[1]/div[1]/div[3]/div[1]/div/div/div[5]/div[1]/label/span")
    private WebElement selectThirdCardToCompare;

    @FindBy(xpath = "(//a[contains(text(),'В сравнении')])[2]")
    private WebElement clickToCompare;

    public ComparePage(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    public void setAddFilter() {
        clickOn(addFilter);
    }

    public void setSelectSecondCardToCompare() {
        clickOn(selectSecondCardToCompare);
    }

    public void setSelectThirdCardToCompare() {
        clickOn(selectThirdCardToCompare);
    }

    public void setClickToCompare() {
        clickOn(clickToCompare);
    }
}

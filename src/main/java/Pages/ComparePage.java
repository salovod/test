package Pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

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


    public void clickToCompare(int number) throws InterruptedException {
        List<WebElement> results = this.getListByClassName("gtile-i-wrap");
        for (WebElement element : results) {
            element.findElement(By.className("g-tools-to-compare-check")).click();
            Thread.sleep(1000);
        }
    }

    protected List<WebElement> getListByClassName(String className) {
        WebElement definitionList = getDriver().findElement(By.name("goods_list"));
        List<WebElement> results = definitionList.findElements(By.className(className));
        return results;
    }
}

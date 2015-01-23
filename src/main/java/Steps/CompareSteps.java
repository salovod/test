package Steps;

import Pages.ComparePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class CompareSteps extends ScenarioSteps {
    ComparePage comparePage;

    public CompareSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void start_browser() {
        ComparePage loginPage = getPages().get(ComparePage.class);
        loginPage.open();
    }

    @Step
    public void addFilter() {
        comparePage.setAddFilter();
    }

    @Step
    public void clickOnFirstCardToCompare() {
        comparePage.setSelectSecondCardToCompare();
    }

    @Step
    public void clickOnSecondCardToCompare() {
        comparePage.setSelectThirdCardToCompare();
    }

    @Step
    public void clickToCompare() {
        comparePage.setClickToCompare();
    }

    @Step
    public void selectElement(int number) {
        comparePage.selectThis(number);
    }
}

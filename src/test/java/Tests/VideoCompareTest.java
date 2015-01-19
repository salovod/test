package Tests;

import Utils.Application;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@Story(Application.GHARebuild.Register.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads = "1")
public class VideoCompareTest extends BeforeClass {
    @ManagedPages(defaultUrl = "http://hard.rozetka.com.ua/videocards/c80087/")
    public Pages pages;

    @WithTag("compare_two_cards")
    @Test
    public void compareTwoCards() throws InterruptedException {
        compare.addFilter();
        compare.clickOnFirstCardToCompare();
        compare.clickOnSecondCardToCompare();
        compare.clickToCompare();
    }
}

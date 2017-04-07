package cucumberTestProject.pages;

import cucumberTestProject.ILocators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by userqa on 23.03.17.
 */
@DefaultUrl("http://88.198.7.89:8100/web/guest/search/-/search/search?_3_groupId=0&_3_keywords=&_3_selected_scope=product")
public class SearchPage extends PageObject {
    public void theUserClickOnScopeDropdownMenu() {
        $(ILocators.SEARCH_PAGE_SCOPE_DROPDOWN).click();
    }

    public void theUserSelectOption(String arg0) {
        Select dropdown = new Select(getDriver().findElement(By.xpath(ILocators.SEARCH_PAGE_SCOPE_DROPDOWN)));
        dropdown.selectByVisibleText(arg0);
//        $(ILocators.SEARCH_PAGE_OPTION.replace("$1",arg0)).click();
    }

    public void theUserEnterInSearchTextbox(String arg0) {
        $(ILocators.SEARCH_PAGE_SEARCH_FIELD).sendKeys(arg0);
    }

    public  void theUserClickOnSEARCHButton() {
        $(ILocators.SEARCH_PAGE_SEARCH_BUTTON).click();
    }

    public boolean clearButtonIsAppears() {
        return $(ILocators.SEARCH_PAGE_CLEAR_BUTTON).isPresent();
    }

    public void theUserClickOnCLEARButton() {
        $(ILocators.SEARCH_PAGE_CLEAR_BUTTON).click();
    }

    public void listWithSearchResultsShouldContainEntryFromSearch(String arg0) {
        $(ILocators.SEARCH_PAGE_BLOG_ENTRY.replace("$1", arg0)).isPresent();
    }

    public boolean listWithResultsOfSearchShouldDissapear() {
        try {
            getDriver().findElement(By.xpath(ILocators.SEARCH_PAGE_RESULTS_OF_SEARCH));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void theUserClickOnTitleOfTh(String arg0, String arg1) {
        $(ILocators.SEARCH_PAGE_CHOSEN_BLOG_ENTRY.replace("$1",arg0).replace("$2",arg1)).findElement(By.xpath("./..//a")).click();
    }
}

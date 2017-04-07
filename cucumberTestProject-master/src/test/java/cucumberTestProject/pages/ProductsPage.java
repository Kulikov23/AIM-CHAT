package cucumberTestProject.pages;
import cucumberTestProject.ILocators;
import net.serenitybdd.core.IgnoredStepException;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by userqa on 14.03.17.
 */

@DefaultUrl("http://88.198.7.89:8100/web/guest/products")

public class ProductsPage extends PageObject {




    public boolean itemShouldHaveTitle() {
        return $(ILocators.PRODUCTS_DESCRIPTION_PAGE_TITLE).isPresent();
    }

    public boolean itemShouldHaveImage() {
        return $(ILocators.PRODUCTS_DESCRIPTION_PAGE_IMAGE).isPresent();
    }

    public boolean itemShouldHaveDescription() {
        return $(ILocators.PRODUCTS_DESCRIPTION_PAGE_DESCRIPTION).isPresent();
    }




    public void theUserClickOnTitleOfProduct(String arg0) {
        $(ILocators.PRODUCTS_PAGE_TITLE_OF_ITEM.replace("$1", arg0)).click();
    }

    public void theUserClickOnImageOfProduct(String arg0) {
        $(ILocators.PRODUCTS_PAGE_IMAGE_OF_ITEM.replace("$1", arg0)).click();
    }

    public void theUserClickOnReadMoreOfProduct(String arg0) {
        $(ILocators.PRODUCTS_PAGE_READMORE_OF_ITEM.replace("$1", arg0)).click();
    }

    public void goBack() {
        getDriver().navigate().back();
    }

    public void clickOnCategory(String arg1) {
        $(ILocators.PRODUCTS_PAGE_CATEGORY_LIST_ITEM.replace("$1", arg1)).click();
    }

    public void theUserClickOnMainImageInProductDescriptionPage() {
        $(ILocators.PRODUCTS_DESCRIPTION_PAGE_IMAGE).click();
    }

    public boolean closeButtonIsPresent() {
        return $(ILocators.IMAGE_GALLERY_CLOSE_BUTTON).isPresent();
    }

    public boolean rightArrowIsPresent() {
        return $(ILocators.IMAGE_GALLERY_RIGHT_ARROW).isPresent();
    }

    public void clickOnCloseButtonOfImageGallery() {
        $(ILocators.IMAGE_GALLERY_CLOSE_BUTTON).click();
    }

    public void theUserClickOnPagesDropdownMenu() {
        $(ILocators.PRODUCTS_PAGE_PAGES_DROPDOWNMENU).click();
    }

    public void theUserSelectItemInPagesDropdownMenu(String arg0) {
        $(ILocators.PRODUCTS_PAGE_PAGES_DROPDOWNMENU_ITEM.replace("$1", arg0)).click();
    }

    public String getCurrentShowingResultsLabel() {
        return  $(ILocators.PRODUCTS_PAGE_SHOWING_RESULTS_PAGE).getText();
    }

    public int getCurrentNumberOfElements() {
        List<WebElementFacade> list = findAll(ILocators.PRODUCTS_PAGE_PRODUCTS_LIST);
        return list.size();
    }

    public void theUserClickOnItemsPerPageDropdownMenu() {
        $(ILocators.PRODUCTS_PAGE_ITEMS_PER_PAGE_DROPDOWN).click();
    }

    public void theUserSelectItemInItemsPerPageDropdownMenu(String arg0) {
        $(ILocators.SPECIAL_OFFERS_PAGE_ITEMS_PER_PAGE_DROPDOWN_ITEM.replace("$1", arg0)).click();
    }

    public void theUserClickOnSearchButton() {
        $(ILocators.PRODUCTS_PAGE_SEARCH_BUTTON).click();
    }

    public boolean searchPageShouldHaveSearchField() {
        return  $(ILocators.SEARCH_PAGE_SEARCH_FIELD).isPresent();
    }

    public boolean searchPageShouldHaveScopeDropdownMenu() {
        return $(ILocators.SEARCH_PAGE_SCOPE_DROPDOWN).isPresent();
    }

    public boolean searchPageShouldHaveSearchButton() {
        return $(ILocators.SEARCH_PAGE_SEARCH_BUTTON).isPresent();
    }




    public void switchWindow(int arg) {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(arg));
    }

    public String getCurrentUrl() {
        String url = getDriver().getCurrentUrl();
        getDriver().close();
        return url;
    }


    public void theUserClickOnIconInProduct(String arg0, String arg1) {
        $(ILocators.PRODUCTS_PAGE_SOCIAL_NETWORK_ICON.replace("$2", arg0).replace("$1", arg1)).click();
    }

    public void theUserClickOnPaginationButton(String arg0) {
        $(ILocators.PRODUCTS_PAGE_PAGINATION_BUTTON.replace("$1", arg0)).click();
    }

    public void theUserClickOnViewIcon(String arg0) {
        $(ILocators.PRODUCTS_PAGE_VIEW_ICON.replace("$1", arg0)).click();
    }

    public boolean titleOfProducIsVisible() {
      return $(ILocators.PRODUCTS_PAGE_TITLE_OF_ITEM.replace("$1", "1")).isVisible();
    }

    public boolean pageShouldContainInFirstPartOfBreadcrumb(String arg0) {
        return $(ILocators.BREADCRUMB_FIRST_ITEM.replace("$1",arg0)).isPresent();
    }

    public boolean pageShouldContainInSecondPartOfBreadcrumb(String arg0) {
        return $(ILocators.BREADCRUMB_FIRST_ITEM.replace("$1",arg0)).isPresent();
    }

    public void theUserClickOnThCategoryInCategoryList(String arg0) {
        $(ILocators.CATEGORY_LIST_ITEM.replace("$1",arg0)).click();
    }

    public boolean pageShouldHaveInThirdPartOfBreadcrumb(String arg0) {
       return  $(ILocators.BREADCRUMB_CATEGORY.replace("$1",arg0)).isPresent();
    }

    public void theUserOpenListWithSubcategoriesOfCategory(String arg0) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement($(ILocators.CATEGORY_LIST_CATEGORY_FOLDER)).build().perform();
        $(ILocators.CATEGORY_LIST_SUBCATEGORY_LIST).findElement(By.xpath(ILocators.CATEGORY_LIST_SUBCATEGORY_ITEM2)).click();
    }

    public void theUserClickOnSubcategory(String arg0) {
        $(ILocators.CATEGORY_LIST_SUBCATEGORY_ITEM.replace("$1",arg0)).click();
    }

    public boolean pageShouldHaveInFourthPartOfBreadcrumb(String arg0) {
        return $(ILocators.BREADCRUMB_CATEGORY.replace("$1",arg0)).isPresent();
    }

    public String getTextInBreadCrumb() {
        return $(ILocators.BREADCRUMB_LAST).getText();
    }

    public String getNameOfProduct() {
        return $(ILocators.PRODUCTS_DESCRIPTION_PAGE_TITLE).getText();
    }

    public void theUserClickOnPartOfBreadcrumb(String arg0) {
        $(ILocators.BREADCRUMB_FIRST_ITEM.replace("$1",arg0)).click();
    }

//    public void jsExecuter() {
//        JavascriptExecutor js = (JavascriptExecutor)getDriver();
//        js.executeScript("document.getElementById(\"yui_patched_v3_11_0_1_1489738072340_484\").nextSibling.click();");
//    }
}

package cucumberTestProject.pages;

import cucumberTestProject.ILocators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by userqa on 14.03.17.
 */

@DefaultUrl("http://88.198.7.89:8100/web/guest/special-offers")

public class SpecialOffersPage extends PageObject {


    public void theUserClickOnViewIconOnSpecialOffersPage(String arg0) {
        $(ILocators.PRODUCTS_PAGE_VIEW_ICON.replace("$1", arg0)).click();
    }

    public boolean titleOfProductIsVisible() {
        return $(ILocators.PRODUCTS_PAGE_TITLE_OF_ITEM.replace("$1", "1")).isVisible();
    }

    public void theUserClickOnTitleOfThe(String arg0) {
        $(ILocators.PRODUCTS_PAGE_TITLE_OF_ITEM.replace("$1", arg0)).click();
    }

    public boolean productShouldHaveTheTitle() {
        return $(ILocators.PRODUCTS_DESCRIPTION_PAGE_TITLE).isVisible();

    }

    public boolean productShouldHaveTheImage() {
        return $(ILocators.PRODUCTS_DESCRIPTION_PAGE_IMAGE).isVisible();
    }

    public boolean productShouldHaveTheDescription() {
        return $(ILocators.PRODUCTS_DESCRIPTION_PAGE_DESCRIPTION).isVisible();
    }

    public void theUserClickOnReadMoreLinkOfThe(String arg0) {
        $(ILocators.PRODUCTS_PAGE_READMORE_OF_ITEM.replace("$1", arg0)).click();
    }

    public void theUserClickOnImageOfThe(String arg0) {
        $(ILocators.PRODUCTS_PAGE_IMAGE_OF_ITEM.replace("$1", arg0)).click();
    }

    public void goBack() {
        getDriver().navigate().back();
    }

    public void theUserSelectItemInPagesDropdownMenuOnSpecialOffersPage(String arg0) {
        $(ILocators.SPECIAL_OFFERS_PAGE_PAGES_DROPDOWNMENU_ITEM.replace("$1",arg0)).click();
    }
}

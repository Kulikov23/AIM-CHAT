package cucumberTestProject.steps;

import cucumber.api.PendingException;
import cucumberTestProject.ILocators;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumberTestProject.steps.serenity.EndUserSteps;
import org.junit.Assert;

import java.util.Map;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;





    @Given("^the user is on Ictapps home page$")
    public void theUserIsOnIctappsHomePage() throws Throwable {
        anna.go_to_start_page();
    }



    @Given("^the user is on Ictapps start page$")
    public void theUserIsOnIctappsStartPage() throws Throwable {
        anna.go_to_start_page();
    }


    @Then("^Page should have the \"([^\"]*)\" title$")
    public void pageShouldHaveTheTitle(String arg0) throws Throwable {
        anna.pageShouldHaveTheTitle(arg0);
//
    }


    @Then("Page should have the OUR SPECIAL OFFERS header")
    public void pageShouldHaveTheHeader() throws Throwable {
        anna.imageCarouselTitleIsPresent();
    }

    @Then("^Page should have the \"([^\"]*)\" breadcrumb$")
    public void pageShouldHaveTheBreadcrumb(String arg0) throws Throwable {
        anna.pageShouldHaveTheBreadcrumb(arg0);
    }


    @Then("^Page should have the CONTACTS header$")
    public void pageShouldHaveTheCONTACTSHeader() throws Throwable {
        anna.pageShouldHaveTheHeader();
    }

    @When("^the user click on the language dropdown menu$")
    public void theUserClickOnTheLanguageDropdownMenu() throws Throwable {
        anna.click_on_language_dropdown();
    }



    @When("^the user select \"([^\"]*)\" in language dropdown menu$")
    public void theUserSelectInLanguageDropdownMenu(String arg0) throws Throwable {
        anna.select_language_dropdown_item(arg0);
    }


    @Then("^Page should have \"([^\"]*)\" link \"([^\"]*)\"$")
    public void pageShouldHaveLink(String arg0, String arg1) throws Throwable {
        anna.check_translation_link(arg0, arg1);
    }





    @When("^the user click on SIGN IN link$")
    public void theUserClickOnSIGNINLink() throws Throwable {
        anna.click_on_sign_in_link();
    }



    @When("^the user move mouse cursor on \"([^\"]*)\" in OUR SPECIAL OFFERS picture carousel$")
    public void theUserMoveMouseCursorOnInOURSPECIALOFFERSPictureCarousel(String arg0) throws Throwable {
        anna.move_mouse_cursor_on_item(arg0);
    }

    @Then("^item should have title, description and More link of \"([^\"]*)\"$")
    public void itemShouldHaveTitleDescriptionAndMoreLinkOf(String arg0) throws Throwable {
        anna.check_title_description_more(arg0);
    }

    @When("^click on right scroll button$")
    public void clickOnRightScrollButton() throws Throwable {
        anna.click();
    }

    @When("^enter random value in \"([^\"]*)\" textbox$")
    public void enterRandomValueInTextbox(String arg0) throws Throwable {
        anna.enter_random_value(arg0);
    }

    @Then("^the languages should be in correct order :$")
    public void theLanguagesShouldBeInCorrectOrder(Map<Integer, String> arg0) throws Throwable {
        anna.getListOfLanguages();
        anna.checkCorrectOrderOfTheLanguages(arg0);

    }

    @Then("^Move mouse cursor on items$")
    public void moveMouseCursorOnItems() throws Throwable {
        anna.moveMouse();
    }

    @Then("^Move mouse cursor on \"([^\"]*)\"$")
    public void moveMouseCursorOn(String arg0) throws Throwable {
        anna.moveMouseCursorOn(arg0);
    }

    @Then("^Check that item have \"([^\"]*)\"$")
    public void checkThatItemHave(String arg0) throws Throwable {
        anna.checkThatItemHave(arg0);
    }


    @When("^click on title of \"([^\"]*)\" in news feed$")
    public void clickOnTitleOfInNewsFeed(String arg0) throws Throwable {
        anna.clickOnTitleOfInNewsFeed(arg0);
    }

    @Then("^the user should be relocated to page that contains image and Read More link$")
    public void theUserShouldBeRelocatedToPageThatContainsImageAndReadMoreLink() throws Throwable {
        anna.theUserShouldBeRelocatedToPageThatContainsImageAndReadMoreLink();
    }



    @Then("^Page with item description should have - title, image, description$")
    public void pageWithItemDescriptionShouldHaveTitleImageDescription() throws Throwable {
        anna.pageWithItemDescriptionShouldHaveTitleImageDescription();
    }




    @Then("^After click on  of \"([^\"]*)\" page with description should have - title$")
    public void afterClickOnOfPageWithDescriptionShouldHaveTitle(String arg0) throws Throwable {
        anna.afterClickOnOfPageWithDescriptionShouldHaveTitle(arg0);
    }

    @Then("^After click on  of \"([^\"]*)\" page with description should have - image$")
    public void afterClickOnOfPageWithDescriptionShouldHaveImage(String arg0) throws Throwable {
        anna.afterClickOnOfPageWithDescriptionShouldHaveImage(arg0);
    }

    @Then("^After click on  of \"([^\"]*)\" page with description should have - description$")
    public void afterClickOnOfPageWithDescriptionShouldHaveDescription(String arg0) throws Throwable {
        anna.afterClickOnOfPageWithDescriptionShouldHaveDescription(arg0);
    }


    @When("^the user open  product that have three images, \"([^\"]*)\" product in \"([^\"]*)\" category$")
    public void theUserOpenProductThatHaveThreeImagesProductInCategory(String arg0, String arg1) throws Throwable {
        anna.theUserOpenProductThatHaveThreeImages(arg0, arg1);
    }

    @When("^the user click on main image in product description page$")
    public void theUserClickOnMainImageInProductDescriptionPage() throws Throwable {
        anna.theUserClickOnMainImageInProductDescriptionPage();
    }

    @Then("^Close button and right arrow should be at image gallery$")
    public void closeButtonAndRightArrowShouldBeAtImageGallery() throws Throwable {
        anna.closeButtonAndRightArrowShouldBeAtImageGallery();
    }

    @Then("^image gallery should be close after click on close button$")
    public void imageGalleryShouldBeCloseAfterClickOnCloseButton() throws Throwable {
        anna.imageGalleryShouldBeCloseAfterClickOnCloseButton();
    }

    @When("^the user click on pages dropdown menu$")
    public void theUserClickOnPagesDropdownMenu() throws Throwable {
        anna.theUserClickOnPagesDropdownMenu();
    }

    @When("^the user select \"([^\"]*)\" item in pages dropdown menu$")
    public void theUserSelectItemInPagesDropdownMenu(String arg0) throws Throwable {
        anna.theUserSelectItemInPagesDropdownMenu(arg0);
    }

    @Then("^label that showing number of results should change to \"([^\"]*)\"$")
    public void labelThatShowingNumberOfResultsShouldChangeTo(String arg0) throws Throwable {
        anna.labelThatShowingNumberOfResultsShouldChangeTo(arg0);
    }


    @When("^the user click on items per page dropdown menu$")
    public void theUserClickOnItemsPerPageDropdownMenu() throws Throwable {
        anna.theUserClickOnItemsPerPageDropdownMenu();
    }

    @When("^the user select \"([^\"]*)\" item in items per page dropdown menu$")
    public void theUserSelectItemInItemsPerPageDropdownMenu(String arg0) throws Throwable {
        anna.theUserSelectItemInItemsPerPageDropdownMenu(arg0);
    }


    @Then("^product list should contain '(\\d+)' items$")
    public void productListShouldContainItems(int arg0) throws Throwable {
        anna.productListShouldContainItems(arg0);
    }

    @When("^the user click on search button$")
    public void theUserClickOnSearchButton() throws Throwable {
        anna.theUserClickOnSearchButton();
    }

    @Then("^search page should have search field$")
    public void searchPageShouldHaveSearchField() throws Throwable {
        anna.searchPageShouldHaveSearchField();
    }

    @Then("^search page should have scope dropdown menu$")
    public void searchPageShouldHaveScopeDropdownMenu() throws Throwable {
        anna.searchPageShouldHaveScopeDropdownMenu();
    }

    @Then("^search page should have search button$")
    public void searchPageShouldHaveSearchButton() throws Throwable {
        anna.searchPageShouldHaveSearchButton();
    }



    @Then("^page should contain \"([^\"]*)\" part in URL$")
    public void pageShouldContainPartInURL(String arg0) throws Throwable {
        anna.pageShouldContainPartInURL(arg0);
    }


    @When("^the user click on \"([^\"]*)\" icon  in \"([^\"]*)\" product$")
    public void theUserClickOnIconInProduct(String arg0, String arg1) throws Throwable {
        anna.theUserClickOnIconInProduct(arg0, arg1);
    }


    @When("^the user click on \"([^\"]*)\" pagination button$")
    public void theUserClickOnPaginationButton(String arg0) throws Throwable {
        anna.theUserClickOnPaginationButton(arg0);
    }

    @Given("^the user is on Special offers page$")
    public void theUserIsOnSpecialOffersPage() throws Throwable {
        anna.theUserIsOnSpecialOffersPage();
    }

    @Given("^the user is on products page$")
    public void theUserIsOnProductsPage() throws Throwable {
        anna.theUserIsOnProductsPage();
    }

    @When("^the user click on \"([^\"]*)\" view icon$")
    public void theUserClickOnViewIcon(String arg0) throws Throwable {
        anna.theUserClickOnViewIcon(arg0);
    }

    @Then("^products list should change it's view on grid$")
    public void productsListShouldChangeItSViewOnGrid() throws Throwable {
        anna.productsListShouldChangeItSViewOnGrid();
    }

    @Then("^products list should change it's view on list$")
    public void productsListShouldChangeItSViewOnList() throws Throwable {
        anna.productsListShouldChangeItSViewOnList();
    }

    @When("^the user click on \"([^\"]*)\" view icon on Special offers page$")
    public void theUserClickOnViewIconOnSpecialOffersPage(String arg0) throws Throwable {
        anna.theUserClickOnViewIconOnSpecialOffersPage(arg0);
    }

    @Then("^products list on Special offers page should change it's view on grid$")
    public void productsListOnSpecialOffersPageShouldChangeItSViewOnGrid() throws Throwable {
        anna.productsListOnSpecialOffersPageShouldChangeItSViewOnGrid();
    }

    @Then("^products list on Special offers page should change it's view on list$")
    public void productsListOnSpecialOffersPageShouldChangeItSViewOnList() throws Throwable {
        anna.productsListOnSpecialOffersPageShouldChangeItSViewOnList();
    }

    @When("^the user click on title of the \"([^\"]*)\"$")
    public void theUserClickOnTitleOfThe(String arg0) throws Throwable {
        anna.theUserClickOnTitleOfThe(arg0);
    }

    @Then("^Product should have title, description and image$")
    public void productShouldHaveTitleDescriptionAndImage() throws Throwable {
        anna.productShouldHaveTitleDescriptionAndImage();
    }

    @When("^the user click on ReadMore link of the \"([^\"]*)\"$")
    public void theUserClickOnReadMoreLinkOfThe(String arg0) throws Throwable {
        anna.theUserClickOnReadMoreLinkOfThe(arg0);
    }

    @When("^the user click on image of the \"([^\"]*)\"$")
    public void theUserClickOnImageOfThe(String arg0) throws Throwable {
        anna.theUserClickOnImageOfThe(arg0);
    }

    @When("^the user click on title of the \"([^\"]*)\" blog entry$")
    public void theUserClickOnTitleOfTheBlogEntry(String arg0) throws Throwable {
        anna.theUserClickOnTitleOfTheBlogEntry(arg0);
    }

    @Then("^Entry should contain all required elements$")
    public void entryShouldContainAllRequiredElements() throws Throwable {
        anna.entryShouldContainAllRequiredElements();
    }

    @When("^the user click on READ link of the \"([^\"]*)\" blog entry$")
    public void theUserClickOnREADLinkOfTheBlogEntry(String arg0) throws Throwable {
        anna.theUserClickOnREADLinkOfTheBlogEntry(arg0);
    }

    @When("^the user click on image of the \"([^\"]*)\" blog entry$")
    public void theUserClickOnImageOfTheBlogEntry(String arg0) throws Throwable {
        anna.theUserClickOnImageOfTheBlogEntry(arg0);
    }

    @When("^the user click on Comments link of the \"([^\"]*)\" blog entry$")
    public void theUserClickOnCommentsLinkOfTheBlogEntry(String arg0) throws Throwable {
        anna.theUserClickOnCommentsLinkOfTheBlogEntry(arg0);
    }

    @Given("^the user is on Blogs page$")
    public void theUserIsOnBlogsPage() throws Throwable {
        anna.theUserIsOnBlogsPage();
    }



    @When("^the user click on View Original Post link$")
    public void theUserClickOnViewOriginalPostLink() throws Throwable {
        anna.theUserClickOnViewOriginalPostLink();
    }

    @Then("^Website contains title of post that was chosen$")
    public void websiteContainsTitleOfPostThatWasChosen() throws Throwable {
        anna.websiteContainsTitleOfPostThatWasChosen();
    }


    @When("^the user enter value in search field$")
    public void theUserEnterValueInSearchField() throws Throwable {
        anna.theUserEnterValueInSearchField();
    }

    @When("^the user press Enter button$")
    public void theUserPressEnterButton() throws Throwable {
        anna.theUserPressEnterButton();
    }

    @Then("^Search page should be opened$")
    public void searchPageShouldBeOpened() throws Throwable {
        anna.searchPageShouldBeOpened();
    }

    @When("^the user click on ReadMore link$")
    public void theUserClickOnReadMoreLink() throws Throwable {
        anna.theUserClickOnReadMoreLink();
    }

    @Then("^Website is opened and contains title of post that was chosen$")
    public void websiteIsOpenedAndContainsTitleOfPostThatWasChosen() throws Throwable {
        anna.websiteIsOpenedAndContainsTitleOfPostThatWasChosen();
    }

    @When("^the user click on Previous link$")
    public void theUserClickOnPreviousLink() throws Throwable {
        anna.theUserClickOnPreviousLink();
    }

    @Then("^entry should change to previous$")
    public void entryShouldChangeToPrevious() throws Throwable {
        anna.entryShouldChangeToPrevious();
    }

    @When("^the user click on Next link$")
    public void theUserClickOnNextLink() throws Throwable {
        anna.theUserClickOnNextLink();
    }

    @Then("^entry should change to next$")
    public void entryShouldChangeToNext() throws Throwable {
        anna.entryShouldChangeToPrevious();
    }

    @Given("^User is on Contact Us page$")
    public void userIsOnContactUsPage() throws Throwable {
        anna.userIsOnContactUsPage();
    }

    @When("^the user click on SEND button$")
    public void theUserClickOnSENDButton() throws Throwable {
        anna.theUserClickOnSENDButton();
    }

    @Then("^error message appears above \"([^\"]*)\" textbox$")
    public void errorMessageAppearsAboveTextbox(String arg0) throws Throwable {
        anna.errorMessageAppearsAboveTextbox(arg0);
    }

    @Then("^error message appears above \"([^\"]*)\" entry area$")
    public void errorMessageAppearsAboveEntryArea(String arg0) throws Throwable {
        anna.errorMessageAppearsAboveEntryArea(arg0);
    }

    @When("^Enter \"([^\"]*)\" in \"([^\"]*)\" textbox$")
    public void enterInTextbox(String arg0, String arg1) throws Throwable {
        anna.enterInTextbox(arg0,arg1);
    }

    @Then("^error message above \"([^\"]*)\" should disappear$")
    public void errorMessageAboveShouldDisappear(String arg0) throws Throwable {
        anna.errorMessageAboveShouldDisappear(arg0);
    }

    @Then("^error message above \"([^\"]*)\" entry area should disappear$")
    public void errorMessageAboveAntryAreaShouldDisappear(String arg0) throws Throwable {
        anna.errorMessageAboveAntryAreaShouldDisappear(arg0);
    }

    @When("^Enter \"([^\"]*)\" in \"([^\"]*)\" entry area$")
    public void enterInEntryArea(String arg0, String arg1) throws Throwable {
        anna.enterInEntryArea(arg0,arg1);
    }

    @When("^the user click on \"([^\"]*)\"$")
    public void theUserClickOn(String arg0) throws Throwable {
        anna.theUserClickOn(arg0);
    }

    @Given("^user is on Sign In page$")
    public void userIsOnSignInPage() throws Throwable {
        anna.userIsOnSignInPage();
    }

    @When("^the user click on SIGN IN link on SIGN IN page$")
    public void theUserClickOnSIGNINLinkOnSIGNINPage() throws Throwable {
        anna.theUserClickOnSIGNINLinkOnSIGNINPage();
    }

    @Then("^error message should appear above \"([^\"]*)\" textbox$")
    public void errorMessageShouldAppearAboveTextbox(String arg0) throws Throwable {
        anna.errorMessageShouldAppearAboveTextbox(arg0);
    }

    @When("^Enter \"([^\"]*)\" in \"([^\"]*)\" textbox on SIGN IN page$")
    public void enterInTextboxOnSIGNINPage(String arg0, String arg1) throws Throwable {
        anna.enterInTextboxOnSIGNINPage(arg0,arg1);
    }

    @Then("^error message above the \"([^\"]*)\" textbox should disappear$")
    public void errorMessageAboveTheTextboxShouldDisappear(String arg0) throws Throwable {
        anna.errorMessageAboveTheTextboxShouldDisappear(arg0);
    }

    @Then("^Request failed to complete error message should appear$")
    public void requestFailedToCompleteErrorMessageShouldAppear() throws Throwable {
        anna.requestFailedToCompleteErrorMessageShouldAppear();
    }

    @Then("^Please try again error message should appear$")
    public void pleaseTryAgainErrorMessageShouldAppear() throws Throwable {
        anna.pleaseTryAgainErrorMessageShouldAppear();
    }

    @When("^the user click on Create Account link$")
    public void theUserClickOnCreateAccountLink() throws Throwable {
        anna.theUserClickOnCreateAccountLink();
    }

    @Then("^Create Account page should be open$")
    public void createAccountPageShouldBeOpen() throws Throwable {
        anna.createAccountPageShouldBeOpen();
    }

    @Given("^the user is on Create Account page$")
    public void theUserIsOnCreateAccountPage() throws Throwable {
        anna.theUserIsOnCreateAccountPage();
    }

    @When("^the user click on SAVE button$")
    public void theUserClickOnSAVEButton() throws Throwable {
        anna.theUserClickOnSAVEButton();
    }



    @Then("^Error message should appear at the right of \"([^\"]*)\" textbox$")
    public void errorMessageShouldAppearAtTheRightOfTextbox(String arg0) throws Throwable {
        anna.errorMessageShouldAppearAtTheRightOfTextbox(arg0);
    }

    @When("^the user click on date picker$")
    public void theUserClickOnDatePicker() throws Throwable {
        anna.theUserClickOnDatePicker();
    }

    @When("^the user click on \"([^\"]*)\" arrow link$")
    public void theUserClickOnArrowLink(String arg0) throws Throwable {
        anna.theUserClickOnArrowLink(arg0);
    }


    @Then("^date should change to \"([^\"]*)\"$")
    public void dateShouldChangeTo(String arg0) throws Throwable {
        anna.dateShouldChangeTo(arg0);
    }

    @When("^the user click on \"([^\"]*)\" calendar day$")
    public void theUserClickOnCalendarDay(String arg0) throws Throwable {
        anna.theUserClickOnCalendarDay(arg0);
    }

    @Then("^date in textbox should change to \"([^\"]*)\"$")
    public void dateInTextboxShouldChangeTo(String arg0) throws Throwable {
        anna.dateInTextboxShouldChangeTo(arg0);
    }

    @When("^the user click on site logotype$")
    public void theUserClickOnSiteLogotype() throws Throwable {
        anna.theUserClickOnSiteLogotype();
    }




    @Then("^Page should have \"([^\"]*)\" URL$")
    public void pageShouldHaveURL(String arg0) throws Throwable {
        anna.pageShouldHaveURL(arg0);
    }

    @Then("^Page have right header$")
    public void pageHaveRightHeader() throws Throwable {
       anna.pageHaveRightHeader();
    }

    @Then("^Page have \"([^\"]*)\" textbox$")
    public void pageHaveTextbox(String arg0) throws Throwable {
        anna.pageHaveTextbox(arg0);
    }


    @Then("^Page should have \"([^\"]*)\" title$")
    public void pageShouldHaveTitle(String arg0) throws Throwable {
        anna.pageShouldHaveTitle(arg0);
    }

    @Then("^Page should have install button$")
    public void pageShouldHaveInstallButton() throws Throwable {
        anna.pageShouldHaveInstallButton();
    }

    @When("^the user click on title of \"([^\"]*)\"$")
    public void theUserClickOnTitleOf(String arg0) throws Throwable {
        anna.theUserClickOnTitleOf(arg0);
    }

    @When("^the user click on MORE link of \"([^\"]*)\"$")
    public void theUserClickOnMORELinkOf(String arg0) throws Throwable {
        anna.theUserClickOnMORELinkOf(arg0);
    }

    @When("^the user click on \"([^\"]*)\" of category image carousel$")
    public void theUserClickOnOfCategoryImageCarousel(String arg0) throws Throwable {
        anna.theUserClickOnOfCategoryImageCarousel(arg0);
    }

    @Then("^URL should contain \"([^\"]*)\" part$")
    public void urlShouldContainPart(String arg0) throws Throwable {
        anna.urlShouldContainPart(arg0);
    }

    @When("^the user select \"([^\"]*)\" item in pages dropdown menu on Special offers page$")
    public void theUserSelectItemInPagesDropdownMenuOnSpecialOffersPage(String arg0) throws Throwable {
        anna.theUserSelectItemInPagesDropdownMenuOnSpecialOffersPage(arg0);
    }


    @When("^the user click on \"([^\"]*)\"th link in footer part$")
    public void theUserClickOnThLinkInFooterPart(String arg0) throws Throwable {
        anna.theUserClickOnFacebookLinkInFooterPart(arg0);
    }

    @Then("^page should contain \"([^\"]*)\" in URL$")
    public void pageShouldContainInURL(String arg0) throws Throwable {
        anna.pageShouldContainInURL(arg0);
    }

    @When("^the user click on \"([^\"]*)\" link \"([^\"]*)\"$")
    public void theUserClickOnLink(String arg0, String arg1) throws Throwable {
        anna.click_menu_link(arg0,arg1);
    }

    @When("^the user click on \"([^\"]*)\"th GOOGLEPLAY link$")
    public void theUserClickOnThGOOGLEPLAYLink(String arg0) throws Throwable {
        anna.theUserClickOnGOOGLEPLAYLink(arg0);
    }

    @When("^the user scroll page down$")
    public void theUserScrollPageDown() throws Throwable {
        anna.theUserScrollPageDown();
    }

    @Given("^the user is on Search page$")
    public void theUserIsOnSearchPage() throws Throwable {
        anna.theUserIsOnSearchPage();
    }

    @When("^the user click on Scope dropdown menu$")
    public void theUserClickOnScopeDropdownMenu() throws Throwable {
        anna.theUserClickOnScopeDropdownMenu();
    }

    @When("^the user select \"([^\"]*)\" option$")
    public void theUserSelectOption(String arg0) throws Throwable {
        anna.theUserSelectOption(arg0);
    }

    @When("^the user enter \"([^\"]*)\" in search textbox$")
    public void theUserEnterInSearchTextbox(String arg0) throws Throwable {
        anna.theUserEnterInSearchTextbox(arg0);
    }

    @When("^the user click on SEARCH button$")
    public void theUserClickOnSEARCHButton() throws Throwable {
       anna.theUserClickOnSEARCHButton();
    }

    @Then("^CLEAR button is appears$")
    public void clearButtonIsAppears() throws Throwable {
        anna.clearButtonIsAppears();
    }

    @When("^the user click on CLEAR button$")
    public void theUserClickOnCLEARButton() throws Throwable {
        anna.theUserClickOnCLEARButton();
    }


    @Then("^list with search results should contain \"([^\"]*)\"$")
    public void listWithSearchResultsShouldContain(String arg0) throws Throwable {
        anna.listWithSearchResultsShouldContainEntryFromSearch(arg0);
    }

    @Then("^list with results of search should dissapear$")
    public void listWithResultsOfSearchShouldDissapear() throws Throwable {
        anna.listWithResultsOfSearchShouldDissapear();
    }

    @When("^the user click on title of \"([^\"]*)\"th \"([^\"]*)\"$")
    public void theUserClickOnTitleOfTh(String arg0, String arg1) throws Throwable {
        anna.theUserClickOnTitleOfTh(arg0,arg1);
    }

    @Then("^Entry should contain \"([^\"]*)\" linked image$")
    public void entryShouldContainLinkedImage(String arg0) throws Throwable {
        anna.entryShouldContainLinkedImage(arg0);
    }

    @Then("^Page should contain \"([^\"]*)\" in first part of breadcrumb$")
    public void pageShouldContainInFirstPartOfBreadcrumb(String arg0) throws Throwable {
        anna.pageShouldContainInFirstPartOfBreadcrumb(arg0);
    }

    @Then("^Page should contain \"([^\"]*)\" in second part of breadcrumb$")
    public void pageShouldContainInSecondPartOfBreadcrumb(String arg0) throws Throwable {
        anna.pageShouldContainInSecondPartOfBreadcrumb(arg0);
    }

    @When("^the user click on \"([^\"]*)\"th category in category list$")
    public void theUserClickOnThCategoryInCategoryList(String arg0) throws Throwable {
        anna.theUserClickOnThCategoryInCategoryList(arg0);
    }

    @Then("^Page should have \"([^\"]*)\" in third part of breadcrumb$")
    public void pageShouldHaveInThirdPartOfBreadcrumb(String arg0) throws Throwable {
        anna.pageShouldHaveInThirdPartOfBreadcrumb(arg0);
    }

    @When("^the user open list with subcategories of \"([^\"]*)\" category$")
    public void theUserOpenListWithSubcategoriesOfCategory(String arg0) throws Throwable {
        anna.theUserOpenListWithSubcategoriesOfCategory(arg0);
    }

    @When("^the user click on \"([^\"]*)\" subcategory$")
    public void theUserClickOnSubcategory(String arg0) throws Throwable {
        anna.theUserClickOnSubcategory(arg0);
    }

    @Then("^Page should have \"([^\"]*)\" in fourth part of breadcrumb$")
    public void pageShouldHaveInFourthPartOfBreadcrumb(String arg0) throws Throwable {
        anna.pageShouldHaveInFourthPartOfBreadcrumb(arg0);
    }

    @Then("^Page should have name of product in last part of breadcrumb$")
    public void pageShouldHaveNameOfProductInLastPartOfBreadcrumb() throws Throwable {
        anna.pageShouldHaveNameOfProductInLastPartOfBreadcrumb();
    }

    @When("^the user click on \"([^\"]*)\" part of breadcrumb$")
    public void theUserClickOnPartOfBreadcrumb(String arg0) throws Throwable {
        anna.theUserClickOnPartOfBreadcrumb(arg0);
    }
}

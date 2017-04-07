package cucumberTestProject.pages;

import cucumberTestProject.ILocators;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@DefaultUrl("http://88.198.7.89:8100/")

public class WelcomePage extends PageObject {


    List<String> languageList = new ArrayList<>();

    public String getCurrentTitle() {
        String title = getTitle();
        return title;
    }


    public void clickOnMenuLink(String arg0, String arg1) {
        withTimeoutOf(3, TimeUnit.SECONDS);
        $(ILocators.WELCOME_HEADER_MENULINK.replace("$1", arg0).replace("$2", arg1)).waitUntilClickable().click();
    }

    public boolean imageCarouselTitleIsPresent() {
        return $(ILocators.WELCOME_IMAGECAROUSEL_SPECIAL).isPresent();
    }

    public boolean breadCrumbIsPresent(String arg0) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.PAGE_BREADCRUMB.replace("$1", arg0))));
        return $(ILocators.PAGE_BREADCRUMB.replace("$1", arg0)).isPresent();

    }

    public boolean headerIsPresent() {
        return $(ILocators.CONTACT_US_HEADER).isPresent();
    }

    public void clickOnLanguageDropdown() {
        $(ILocators.LANGUAGE_DROPDOWN).click();
    }

    public boolean languageDropDownItemIsPresent(String arg0) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.LANGUAGE_DROPDOWN_OPTION.replace("$1", arg0))));
        return $(ILocators.LANGUAGE_DROPDOWN_OPTION.replace("$1", arg0)).isPresent();
    }

    public void selectLanguageDropdownItem(String arg0) {
        $(ILocators.LANGUAGE_DROPDOWN_OPTION.replace("$1", arg0)).click();
    }


    public String check_translation_link(String arg1) {
        return getDriver().findElement(By.xpath(ILocators.WELCOME_HEADER_MENULINK.replace("$1", arg1))).getText();

    }

    public void moveMouseOnItem(String arg0) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement($(ILocators.IMAGE_CAROUSEL_ITEM.replace("$1", arg0))).build().perform();
    }


    public void clickOnSignInLink() {
        $(ILocators.SIGN_IN).click();
    }


    public void moveMouseCursorOnItem(String arg0) {
        Integer integer;
        int num;
        num = Integer.parseInt(arg0);


        if (num < 3) {
            Actions actions = new Actions(getDriver());
            actions.moveToElement($(ILocators.IMAGE_CAROUSEL_ITEM.replace("$1", arg0))).build().perform();
            waitABit(1500);
        } else {
            $(ILocators.SPECIAL_IMAGE_CAROUSEL_NEXT).click();
            Actions actions = new Actions(getDriver());
            actions.moveToElement($(ILocators.IMAGE_CAROUSEL_ITEM.replace("$1", arg0))).build().perform();
            waitABit(1500);
        }


    }

    public boolean titleOfItemIsPresent(String arg0) {
        return $(ILocators.IMAGE_CAROUSEL_TITLE.replace("$1", arg0)).isPresent();
    }

    public boolean descriptionOfItemIsPresent(String arg0) {
        return $(ILocators.IMAGE_CAROUSEL_DESCRIPTION.replace("$1", arg0)).isPresent();
    }

    public boolean moreLinkOfItemIsPresent(String arg0) {
        return $(ILocators.IMAGE_CAROUSEL_MORE.replace("$1", arg0)).isPresent();
    }

    public void clickClick() {
        for (int i = 0; i < 100; i++) {
            new Actions(getDriver()).dragAndDrop($(ILocators.From1), $(ILocators.To1)).perform();
            new Actions(getDriver()).dragAndDrop($(ILocators.From2), $(ILocators.To2)).perform();

        }
    }

    public void enterRandomValue(String arg0) {
        int sizeName = 5000; // size of random string
        String charac = "0123456789abcdefghijklmnopqrstuvwxyz"; //Create the character set for random string
        Random r = new Random();
        String FirstName = generateString(r, charac, sizeName);
        $(ILocators.CONTACT_US_TEXTBOX).sendKeys(FirstName);

    }

    public static String generateString(Random rng, String characters, int length) //creating random string
    {
        char[] text = new char[length]; // Create list of chars
        for (int i = 0; i < length; i++) //Creating number of random symbols, size equals  variable length
        {
            text[i] = characters.charAt(rng.nextInt(characters.length())); //For current step create random character and saves in list
        }
        return new String(text);//return list
    }

    public void getListOfLanguages() {
        List<WebElementFacade> list = findAll(ILocators.LANGUAGES_LIST);
        for (WebElement element : list) {
            System.out.println(element.getText());
            languageList.add(element.getText());
        }
    }

    public boolean checkCorrectOrderOfTheLanguages(Map<Integer, String> arg0) {
        for (String aLanguageList : languageList) {
            if (aLanguageList.equalsIgnoreCase(String.valueOf(arg0))) {
                return false;
            }
        }
        return true;
    }

    public void getCorrectLanguage() {
        System.out.println($(ILocators.LANGUAGES_LIST).getText());
        System.out.println($(ILocators.LANGUAGES_LIST).getText());
        System.out.println($(ILocators.LANGUAGES_LIST).getText());
    }

    public void abcd() {
        List<WebElementFacade> list = findAll(ILocators.CATEGORY_IMAGE_CAROUSEL);
        for (WebElement element : list) {
            System.out.print(element);
//            Actions actions = new Actions(getDriver());
//
//            actions.moveToElement(element).build().perform();
//            waitABit(1500);
        }
    }

    public void moveMouseCursorOn(String arg0) {
        Integer integer;
        int num;
        num = Integer.parseInt(arg0);

        if (num <= 6) {
            Actions actions = new Actions(getDriver());
            actions.moveToElement($(ILocators.CATEGORY_IMAGE_CAROUSEL.replace("$1", arg0))).build().perform();
        } else {
            $(ILocators.CATAGORY_IMAGE_CAROUSEL_NEXT).click();
            Actions actions = new Actions(getDriver());
            actions.moveToElement($(ILocators.CATEGORY_IMAGE_CAROUSEL.replace("$1", arg0))).build().perform();
        }
    }

    public boolean checkThatItemHave(String arg0) {
        return $(ILocators.CATEGORY_IMAGE_CAROUSEL_TEXT.replace("$1", arg0)).isPresent();
    }

    public void clickOnTitleOfInNewsFeed(String arg0) {
        $(ILocators.NEWS_FEED_ITEM_TITLE.replace("$1", arg0)).click();
    }

    public void theUserClickOnSiteLogotype() {
        $(ILocators.WELCOME_PAGE_LOGOTYPE).click();
    }


    public boolean pageHaveRightHeader() {
        return $(ILocators.SIGN_IN_HEADER).isPresent();
    }

    public boolean pageHaveTextbox(String arg0) {
        return $(ILocators.SIGN_IN_INPUT_FIELD.replace("$1",arg0)).isPresent();
    }

    public void theUserClickOnGOOGLEPLAYLink(String arg0) {
        $(ILocators.WELCOME_HEADER_GOOGLEPLAYLINK.replace("$1", arg0)).click();
    }

    public String pageShouldHaveTitle() {
        return $(ILocators.GOOGLE_PLAY_HEADER).getText();
    }

    public boolean pageShouldHaveInstallButton() {
        return $(ILocators.GOOGLE_PLAY_INSTALL_BUTTON).isPresent();
    }

    public void theUserClickOnTitleOf(String arg0) {
        $(ILocators.IMAGE_CAROUSEL_TITLE.replace("$1",arg0)).click();
    }

    public void theUserClickOnMORELinkOf(String arg0) {
        $(ILocators.IMAGE_CAROUSEL_MORE.replace("$1", arg0)).click();
    }

    public void theUserClickOnOfCategoryImageCarousel(String arg0) {
        $(ILocators.CATEGORY_IMAGE_CAROUSEL.replace("$1",arg0)).click();
    }

    public String getURLCurrent() {
        String url = getDriver().getCurrentUrl();
        return url;
    }

    public void theUserClickOnFacebookLinkInFooterPart(String arg0) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement($(ILocators.WELCOME_PAGE_SOCIAL_BLOCK_FOOTER)).build().perform();
        $(ILocators.WELCOME_PAGE_FOOTER_SOCIAL_ICON.replace("$1", arg0)).click();
    }

    public void timeForTea() {
        getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }
}


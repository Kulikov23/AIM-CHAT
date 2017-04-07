package cucumberTestProject.pages;

import cucumberTestProject.ILocators;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.core.Serenity.*;
import static org.yecht.LevelStatus.header;

/**
 * Created by userqa on 14.03.17.
 */

@DefaultUrl("http://88.198.7.89:8100/web/guest/blogs")
public class BlogsPage extends PageObject {

    String header;

    public boolean theUserShouldBeRelocatedToPageThatContainsImage() {
        return $(ILocators.BLOG_DESCRIPTION_PAGE_IMAGE).isPresent();
    }

    public boolean theUserShouldBeRelocatedToPageThatContainsReadMoreLink() {
        return $(ILocators.BLOG_DESCRIPTION_PAGE_READMORE).isPresent();
    }


    public void theUserClickOnTitleOfTheBlogEntry(String arg0) {
        $(ILocators.BLOG_ENTRY_TITLE.replace("$1", arg0)).click();
    }


    public boolean entryShouldContainImage() {
        return $(ILocators.BLOG_DESCRIPTION_PAGE_IMAGE).isPresent();
    }

    public boolean entryShouldContainReadMore() {
        return $(ILocators.BLOG_DESCRIPTION_PAGE_READMORE).isPresent();
    }

    public boolean entryShouldContainOriginalPost() {
        return $(ILocators.BLOG_DESCRIPTION_PAGE_ORIGINAL_POST).isPresent();
    }


    public void theUserClickOnREADLinkOfTheBlogEntry(String arg0) {
        $(ILocators.BLOG_ENTRY_MORE.replace("$1", arg0)).click();
    }

    public void theUserClickOnImageOfTheBlogEntry(String arg0) {
        $(ILocators.BLOG_ENTRY_IMAGE.replace("$1", arg0)).click();
    }

    public void theUserClickOnCommentsLinkOfTheBlogEntry(String arg0) {
        $(ILocators.BLOG_ENTRY_COMMENTS.replace("$1", arg0)).click();
    }


    public void theUserClickOnViewOriginalPostLink() {
        $(ILocators.BLOG_DESCRIPTION_PAGE_ORIGINAL_POST).click();
    }


    public boolean websiteContainsTitleOfPostThatWasChosen() {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.HEADER_ON_SOURCE_PAGE.replace("$1", header))));
        boolean a = $(ILocators.HEADER_ON_SOURCE_PAGE.replace("$1", header)).isPresent();
//        boolean a = $(ILocators.HEADER_ON_SOURCE_PAGE.replace("$1", header)).isPresent();
        getDriver().close();
        return a;
    }

    public void saveBlogText() {
        header = $(ILocators.BLOG_DESCRIPTION_PAGE_BREADCRUMB).getText();
    }


    public void theUserEnterValueInSearchField() {
        $(ILocators.SEARCH_FIELD).sendKeys("2");
    }

    public void theUserPressEnterButton() {
        $(ILocators.SEARCH_FIELD).sendKeys(Keys.ENTER);
    }

    public void theUserClickOnReadMoreLink() {
        $(ILocators.BLOG_DESCRIPTION_PAGE_READMORE).click();
    }

    public boolean websiteIsOpenedAndContainsTitleOfPostThatWasChosen() {
        return $(ILocators.HEADER_ON_SOURCE_PAGE.replace("$1", header)).isPresent();
    }

    public void theUserClickOnPreviousLink() {
        header = $(ILocators.BLOG_DESCRIPTION_PAGE_BREADCRUMB).getText();
        $(ILocators.BLOG_DESCRIPTION_PAGE_PREVIOUS_BUTTON).click();
    }

    public boolean headerNotEqual() {
        return header.equals($(ILocators.BLOG_DESCRIPTION_PAGE_BREADCRUMB).getText());
    }


    public void theUserClickOnNextLink() {
        header = $(ILocators.BLOG_DESCRIPTION_PAGE_BREADCRUMB).getText();
        $(ILocators.BLOG_DESCRIPTION_PAGE_NEXT_BUTTON).click();
    }

    public boolean entryShouldContainLinkedImage(String arg0) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.BLOG_DESCRIPTION_PAGE_SOCIAL_ICON.replace("$1",arg0))));
        return $(ILocators.BLOG_DESCRIPTION_PAGE_SOCIAL_ICON.replace("$1",arg0)).isVisible();
    }
}

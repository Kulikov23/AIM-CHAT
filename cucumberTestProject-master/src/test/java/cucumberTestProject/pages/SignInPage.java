package cucumberTestProject.pages;

import cucumberTestProject.ILocators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Created by userqa on 20.03.17.
 */
@DefaultUrl("http://88.198.7.89:8100/web/guest/welcome/-/login/login?saveLastPath=false")
public class SignInPage extends PageObject {

    public void theUserClickOn(String arg0) {
        $(ILocators.SIGN_IN_SOCIAL_ICONS.replace("$1", arg0)).click();
    }

    public void theUserClickOnSIGNINLinkOnSIGNINPage() {
        $(ILocators.SIGN_IN_BUTTON).click();
    }

    public boolean errorMessageShouldAppearAboveTextbox(String arg0) {
       return  $(ILocators.SIGN_IN_ERROR_MESSAGE.replace("$1",arg0)).isVisible();
    }

    public void enterInTextboxOnSIGNINPage(String arg0, String arg1) {
        $(ILocators.SIGN_IN_INPUT_FIELD.replace("$1",arg1)).clear();
        $(ILocators.SIGN_IN_INPUT_FIELD.replace("$1",arg1)).sendKeys(arg0);
    }

    public boolean errorMessageAboveTheTextboxShouldDisappear(String arg0) {
        try {
            getDriver().findElement(By.xpath(ILocators.SIGN_IN_INPUT_FIELD.replace("$1",arg0)));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean requestFailedToCompleteErrorMessageShouldAppear() {
        return $(ILocators.SIGN_IN_ERROR_MESSAGE_REQUEST).isPresent();
    }

    public boolean pleaseTryAgainErrorMessageShouldAppear() {
        return $(ILocators.SIGN_IN_ERROR_MESSAGE_TRY_AGAIN).isPresent();
    }

    public void theUserClickOnCreateAccountLink() {
        $(ILocators.SIGN_IN_CREATE_ACCOUNT_LINK).click();
    }

    public boolean createAccountPageShouldBeOpen() {
        return $(ILocators.CREATE_ACCOUNT_HEADER).isPresent();
    }

    //   return $(ILocators.SIGN_IN_INPUT_FIELD.replace("$1",arg0)).isEmpty();

}

package cucumberTestProject.pages;

import cucumberTestProject.ILocators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by userqa on 14.03.17.
 */
@DefaultUrl("http://88.198.7.89:8100/web/guest/contact-us")
public class ContactUsPage extends PageObject {


    public void theUserClickOnSENDButton() {
        $(ILocators.CONTACTUS_PAGE_SEND_BUTTON).click();
    }

    public boolean errorMessageAppearsAboveTextbox(String arg0) {
        return $(ILocators.CONTACTUS_PAGE_ERROR_MESSAGE.replace("$1", arg0)).isPresent();
    }

    public boolean errorMessageAppearsAboveEntryArea(String arg0) {
        return $(ILocators.CONTACTUS_PAGE_ERROR_MESSAGE_COMMENTS.replace("$1", arg0)).isPresent();
    }

    public void enterInTextbox(String arg0, String arg1) {
        $(ILocators.CONTACTUS_PAGE_INPUTFIELD.replace("$1", arg1)).sendKeys(arg0);
    }

    public boolean errorMessageAboveShouldDisappear(String arg0) {
       return  $(ILocators.CONTACTUS_PAGE_ERROR_MESSAGE.replace("$1", arg0)).isVisible();
    }

    public boolean errorMessageAboveAntryAreaShouldDisappear(String arg0) {
        return $(ILocators.CONTACTUS_PAGE_ERROR_MESSAGE_COMMENTS.replace("$1",arg0)).isVisible();
    }

    public void enterInEntryArea(String arg0, String arg1) {
        $(ILocators.CONTACTUS_PAGE_TEXTAREA).sendKeys(arg0);
    }
}

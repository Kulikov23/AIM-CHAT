package cucumberTestProject.pages;

import cucumberTestProject.ILocators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by userqa on 20.03.17.
 */
@DefaultUrl("http://88.198.7.89:8100/web/guest/welcome?p_p_id=58&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&saveLastPath=false&_58_struts_action=%2Flogin%2Fcreate_account")
public class CreateNewAccountPage extends PageObject {
    String currentDate;

    public void theUserClickOnSAVEButton() {
        $(ILocators.CREATE_ACCOUNT_SAVE_BUTTON).click();
    }


    public boolean errorMessageShouldAppearAtTheRightOfTextbox(String arg0) {
        if (arg0.equals(" Email Address ")) {
            return $(ILocators.CREATE_ACCOUNT_ERROR_MESSAGE_EMAIL.replace("$1",arg0)).isPresent();
        } else{
            return $(ILocators.CREATE_ACCOUNT_ERROR_MESSAGE.replace("$1", arg0)).isPresent();
        }
    }

    public void theUserClickOnDatePicker() {
        $(ILocators.CREATE_ACCOUNT_DATE_PICKER).click();
    }

    public void theUserClickOnArrowLink(String arg0) {
//        currentDate = $(ILocators.CREATE_ACCOUNT_DATE_PICKER_CURRENT_DATE).getText();
        $(ILocators.CREATE_ACCOUNT_DATE_PICKER_RIGHT_ARROW.replace("$1", arg0)).click();
    }

    public String dateShouldChangeTo() {
        return  $(ILocators.CREATE_ACCOUNT_DATE_PICKER_CURRENT_DATE).getText();
    }

    public void theUserClickOnCalendarDay(String arg0) {
        $(ILocators.CREATE_ACCOUNT_DATE_PICKER_CALENDAR_DATE.replace("$1",arg0)).click();
    }

    public boolean dateInTextboxShouldChangeTo(String arg0) {
        return $(ILocators.CREATE_ACCOUNT_DATE_PICKER_VALUE.replace("$1", arg0)).isPresent();
    }
}

package Practice.steps.serenity;

import Practice.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;

public class EndUserSteps {
    DictionaryPage dictionaryPage;

    @Step
    public void theUserIsOnTheLoginPage() {
        dictionaryPage.open();
    }

    @Step
    public void writeAnd(String arg0, String arg1) {
        dictionaryPage.writeAnd(arg0, arg1);
    }

    @Step
    public void clickButton(String arg0) {
        dictionaryPage.clickButton(arg0);
    }

    @Step
    public void createChannel() {
        dictionaryPage.createChannel();
    }

    @Step
    public void deleteChannel() {
        dictionaryPage.deleteChannel();
    }

    @Step
    public void spam(String arg0, String arg1) {
        dictionaryPage.spam(arg0, arg1);
    }
}

package Practice.steps;

import cucumber.api.PendingException;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import Practice.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps steps;

    @Given("^the user is on the login page$")
    public void theUserIsOnTheLoginPage() throws Throwable {
        steps.theUserIsOnTheLoginPage();
    }

    @When("^Write \"([^\"]*)\" and \"([^\"]*)\"$")
    public void whenWriteAnd(String arg0, String arg1) throws Throwable {
        steps.writeAnd(arg0, arg1);
    }

    @When("^Click \"([^\"]*)\" button$")
    public void clickButton(String arg0) throws Throwable {
        steps.clickButton(arg0);
    }

    @When("^Create channel$")
    public void createChannel() throws Throwable {
        steps.createChannel();
    }

//TODO:////////////////////////         DELETE          ////////////////////////////////////////////////////////////////

    @When("^Delete channel$")
    public void deleteChannel() throws Throwable {
        steps.deleteChannel();
    }

//TODO:////////////////////////         SPAM          ////////////////////////////////////////////////////////////////

    @When("^Spam \"([^\"]*)\" message in the \"([^\"]*)\" room$")
    public void spamMessage(String arg0, String arg1) throws Throwable {
        steps.spam(arg0, arg1);
    }


}
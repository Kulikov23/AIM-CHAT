package cucumberTestProject;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/Ict4appsWelcomePage.feature")
//        "src/test/resources/features/Ict4appsProductsPage.feature",
//        "src/test/resources/features/Ict4appsSpecialOffersPage.feature",
//        "src/test/resources/features/Ict4appsBlogsPage.feature",
//        "src/test/resources/features/Ict4appsContactUsPage.feature"

public class DefinitionTestSuite {}

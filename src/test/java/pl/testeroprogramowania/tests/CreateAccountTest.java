package pl.testeroprogramowania.tests;

import pl.testeroprogramowania.steps.serenity.HomePageSteps;
import pl.testeroprogramowania.steps.serenity.MyAccountSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CreateAccountTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private HomePageSteps homePageSteps;

    @Steps
    private MyAccountSteps myAccountSteps;

    @Test
    public void createSameAccount() {
       homePageSteps.openHomePage();
       homePageSteps.openMyAccountPage();

       myAccountSteps.registerUser("random@gmail.com","Bartek123@123");
       myAccountSteps.checkErrorMessage("An account is already registered");
    }

}

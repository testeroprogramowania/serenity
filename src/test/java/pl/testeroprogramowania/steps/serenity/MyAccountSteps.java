package pl.testeroprogramowania.steps.serenity;

import pl.testeroprogramowania.pages.MyAccountPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class MyAccountSteps {

    private MyAccountPage myAccountPage;

    @Step("Register user with email {0} and password {1}")
    public void registerUser(String email, String password) {
        myAccountPage.registerUser(email,password);
    }


    @Step("Checking if error message contains {0}")
    public void checkErrorMessage(String message) {
        Serenity.takeScreenshot();
        Serenity.recordReportData().withTitle("Msg").andContents(message);
        myAccountPage.checkErrorMessage(message);
    }
}

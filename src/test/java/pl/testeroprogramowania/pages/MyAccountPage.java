package pl.testeroprogramowania.pages;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MyAccountPage extends PageObject {

    @FindBy(id = "reg_email")
    private WebElementFacade regEmailInput;

    @FindBy(id = "reg_password")
    private WebElementFacade regPasswordInput;

    @FindBy(name = "register")
    private WebElementFacade registerButton;

    @FindBy(xpath = "//ul[@class='woocommerce-error']//li")
    private WebElementFacade errorMessage;

    public void registerUser(String email, String password) {
        regEmailInput.type(email);
        Serenity.takeScreenshot();
        Serenity.recordReportData().withTitle("Email and Password").andContents(email + " and " + password);
        withAction().moveToElement(registerButton).build().perform();
        regPasswordInput.typeAndEnter(password);
    }

    public void checkErrorMessage(String message) {
         errorMessage.shouldContainText(message);
    }
}

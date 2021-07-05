package pl.testeroprogramowania.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ShopHomePage extends PageObject {

    @FindBy(linkText = "My account")
    private WebElementFacade myAccountLink;

    public void openMyAccountPage() {
        waitFor(myAccountLink).isVisible();
        myAccountLink.click();
    }
}

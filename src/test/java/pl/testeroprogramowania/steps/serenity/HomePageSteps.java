package pl.testeroprogramowania.steps.serenity;

import pl.testeroprogramowania.pages.ShopHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomePageSteps extends ScenarioSteps {

    private ShopHomePage homePage;

    @Step(value = "Opening home page!")
    public void openHomePage() {
        homePage.open(); }

    @Step("Opening my account page!")
    public void openMyAccountPage() {
        homePage.openMyAccountPage();
    }
}

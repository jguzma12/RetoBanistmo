package co.com.certifications.banistmo.stepdefinitions;

import co.com.certifications.banistmo.questions.ValidateURL;
import co.com.certifications.banistmo.tasks.DownloadDocument;
import co.com.certifications.banistmo.utils.Const;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class DownloadStepDefinitions {
    @Managed
    WebDriver driver;

    @Before
    public void setup() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Actor");
    }
    @Given("^the user enter the page$")
    public void theUserEnterThePage() {OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Const.URL));

    }

    @When("^the user is going to download the document$")
    public void theUserIsGoingToDownLoadTheDocument() {
        OnStage.theActorInTheSpotlight().attemptsTo(DownloadDocument.document());

    }

    @Then("^the user should see the document$")
    public void theUserShouldSeeTheDocument() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateURL.with()));
    }
}

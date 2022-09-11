package com.narvaez.qa.stepsdefinitions;

import com.narvaez.qa.questions.Passenger;
import com.narvaez.qa.tasks.OpenBrowser;
import com.narvaez.qa.tasks.OpenSearch;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class passengerStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Yilmer D Narvaez");
    }

    @Given("^The user in the search section$")
    public void theUserInTheSearchSection() {

        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^This user clicks on passenger$")
    public void thisUserClicksOnPassenger() {

        OnStage.theActorInTheSpotlight().wasAbleTo(OpenSearch.search());
    }

    @Then("^He can see an adult preselected (.*)$")
    public void heCanSeeAnAdultPreselected(String numberPassenger) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Passenger.message(), org.hamcrest.Matchers.is(numberPassenger)));
    }
}

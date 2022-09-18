package com.narvaez.qa.stepsdefinitions;

import com.narvaez.qa.questions.Destination;
import com.narvaez.qa.tasks.OpenDestination;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class destinationStepDefinitions {

    @When("^this user clicks on destination city$")
    public void thisUserClicksOnDestinationCity() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenDestination.destination());
    }

    @Then("^he can see the destination cities the user can travel to (.*)$")
    public void heCanSeeTheDestinationCitiesTheUserCanTravelTo(String CountryDestination) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Destination.message(), org.hamcrest.Matchers.is(CountryDestination)));
    }

}

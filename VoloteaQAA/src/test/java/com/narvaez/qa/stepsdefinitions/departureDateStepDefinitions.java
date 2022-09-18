package com.narvaez.qa.stepsdefinitions;

import com.narvaez.qa.questions.Departure;
import com.narvaez.qa.questions.Destination;
import com.narvaez.qa.tasks.OpenDepartureDate;
import com.narvaez.qa.tasks.OpenDestination;
import com.narvaez.qa.tasks.SelectDepartureDate;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;


import static com.narvaez.qa.userInterfaces.Departure.ENTER_ENABLEDATE;
import static com.narvaez.qa.userInterfaces.Departure.VALIDATE_DEPARTUREDATE;

public class departureDateStepDefinitions {


    @Given("^this user clicks on the destination city$")
    public void thisUserClicksOnTheDestinationCity() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenDestination.destination());
    }

    @When("^choose in the departure date option$")
    public void chooseInTheDepartureDateOption() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenDepartureDate.departure());
    }

    @And("^the user selects a date enabled$")
    public void theUserSelectsADateEnabled() {
        OnStage.theActorInTheSpotlight().wasAbleTo(SelectDepartureDate.select());
    }

    @Then("^the lower dates are disabled$")
    public void theLowerDatesAreDisabled() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Departure.isDisable()));
    }
}

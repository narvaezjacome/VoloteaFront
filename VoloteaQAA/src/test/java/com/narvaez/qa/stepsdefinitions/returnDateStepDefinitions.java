package com.narvaez.qa.stepsdefinitions;

import com.narvaez.qa.questions.Departure;
import com.narvaez.qa.questions.Return;
import com.narvaez.qa.tasks.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class returnDateStepDefinitions {



    @When("^this user clicks start date$")
    public void thisUserClicksStartDate() {

        OnStage.theActorInTheSpotlight().wasAbleTo(OpenDepartureDate.departure());
        OnStage.theActorInTheSpotlight().wasAbleTo(SelectDepartureDate.select());

    }

    @And("^choose on the return date$")
    public void chooseOnTheReturnDate() {
        OnStage.theActorInTheSpotlight().wasAbleTo(SelectReturnDate.returnDate());
    }

    @And("^the user changes the checkout date$")
    public void theUserChangesTheCheckoutDate() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Departure.isDisable()));
    }

    @Then("^user can see later dates disabled$")
    public void userCanSeeLaterDatesDisabled() {
        OnStage.theActorInTheSpotlight().wasAbleTo(DeselectDepartureDate.returnDate());
    }

    @And("^the user selects another departure date, the return date is deselected$")
    public void theUserSelectsAnotherDepartureDateTheReturnDateIsDeselected() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Return.deselect()));
    }
}

package com.narvaez.qa.stepsdefinitions;

import com.narvaez.qa.questions.Origin;
import com.narvaez.qa.tasks.OpenBrowser;
import com.narvaez.qa.tasks.OpenOrigin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;


import net.serenitybdd.screenplay.actors.OnStage;



public class originStepDefinitions {



    @When("^This user selects the option countries of origin$")
    public void thisUserSelectsTheOptionCountriesOfOrigin() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenOrigin.origin());
    }

    @Then("^The user can see the number of cities grouped by country (.*)$")
    public void theUserCanSeeTheNumberOfCitiesGroupedByCountry(String countryGroup) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Origin.message(), org.hamcrest.Matchers.is(countryGroup)));
    }
}

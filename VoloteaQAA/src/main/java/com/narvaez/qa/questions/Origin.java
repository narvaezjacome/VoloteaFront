package com.narvaez.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.narvaez.qa.userInterfaces.Origin.VALIDATE_COUNTRYGROUP;


public class Origin  implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((VALIDATE_COUNTRYGROUP), WebElementStateMatchers.isVisible()));
        return Text.of(VALIDATE_COUNTRYGROUP).viewedBy(actor).asString();
    }
    public static Origin message(){ return new Origin();}
}

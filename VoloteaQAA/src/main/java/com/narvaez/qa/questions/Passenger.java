package com.narvaez.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.narvaez.qa.userInterfaces.Search.VALIDATE_PRESELECT;

public class Passenger implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((VALIDATE_PRESELECT), WebElementStateMatchers.isVisible()));
        return Text.of(VALIDATE_PRESELECT).viewedBy(actor).asString();
    }
    public static Passenger message(){
        return new Passenger();
    }
}

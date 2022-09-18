package com.narvaez.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.narvaez.qa.userInterfaces.Destination.VALIDATE_COUNTRYDESTINATION;


public class Destination implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((VALIDATE_COUNTRYDESTINATION), WebElementStateMatchers.isEnabled()));
        return Text.of(VALIDATE_COUNTRYDESTINATION).viewedBy(actor).asString();
    }
    public static Destination message(){ return new Destination();}
}

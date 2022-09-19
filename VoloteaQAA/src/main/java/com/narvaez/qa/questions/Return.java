package com.narvaez.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.narvaez.qa.userInterfaces.Departure.VALIDATE_DEPARTUREDATE;
import static com.narvaez.qa.userInterfaces.Return.VALIDATE_RETURNDATE_DESELECT;

public class Return implements Question<Boolean> {
    @Override
    public Boolean answeredBy (Actor actor){
        return !VALIDATE_RETURNDATE_DESELECT.resolveFor(actor).isVisible();
    }
    public static Return deselect () { return new Return();}
}

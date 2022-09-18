package com.narvaez.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static com.narvaez.qa.userInterfaces.Departure.*;


public class Departure implements Question<Boolean> {
        @Override
        public Boolean answeredBy (Actor actor){
        return !VALIDATE_DEPARTUREDATE.resolveFor(actor).isVisible();
    }
        public static Departure isDisable () { return new Departure();}
    }

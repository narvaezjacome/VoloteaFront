package com.narvaez.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.narvaez.qa.userInterfaces.Departure.*;

public class SelectDepartureDate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(ENTER_ENABLEDATE));

    }

    public static SelectDepartureDate select() {
        return Tasks.instrumented(SelectDepartureDate.class);
    }
}
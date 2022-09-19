package com.narvaez.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.narvaez.qa.userInterfaces.Return.CLOSE_DEPARTURE_SELECTED;


public class DeselectDepartureDate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLOSE_DEPARTURE_SELECTED));
    }

    public static SelectReturnDate returnDate() {return Tasks.instrumented(SelectReturnDate.class);
    }
}

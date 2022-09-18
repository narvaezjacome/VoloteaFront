package com.narvaez.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.narvaez.qa.userInterfaces.Destination.ENTER_DESTINATION;


public class OpenDestination implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ENTER_DESTINATION));

    }

    public static OpenDestination destination() {return Tasks.instrumented(OpenDestination.class);
    }
}

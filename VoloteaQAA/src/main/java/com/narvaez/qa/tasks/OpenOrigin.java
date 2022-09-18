package com.narvaez.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static com.narvaez.qa.userInterfaces.Origin.*;



public class OpenOrigin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ENTER_ORIGIN));
        actor.attemptsTo(Click.on(ENTER_COUNTRY));
    }

    public static OpenOrigin origin() {
        return Tasks.instrumented(OpenOrigin.class);
    }
}

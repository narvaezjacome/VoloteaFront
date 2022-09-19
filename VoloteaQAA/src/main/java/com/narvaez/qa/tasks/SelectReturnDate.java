package com.narvaez.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.narvaez.qa.userInterfaces.Return.ENTER_RETURNDATE;

public class SelectReturnDate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ENTER_RETURNDATE));
        }

    public static SelectReturnDate returnDate() {return Tasks.instrumented(SelectReturnDate.class);
    }
}

package com.narvaez.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.narvaez.qa.userInterfaces.Search.*;

public class OpenSearch implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ENTER_PASSENGER));

    }
    public static OpenSearch search(){
        return Tasks.instrumented(OpenSearch.class);
    }
}

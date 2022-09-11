package com.narvaez.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static com.narvaez.qa.userInterfaces.Search.ACCEPT_COOKIES;


public class OpenBrowser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.url("https://www.volotea.com/es/"));
        actor.attemptsTo(Click.on(ACCEPT_COOKIES));
    }

    public static OpenBrowser browser() {
        return Tasks.instrumented(OpenBrowser.class);
    }
}

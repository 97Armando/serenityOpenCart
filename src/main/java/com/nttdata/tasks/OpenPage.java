package com.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.Wait;

public class OpenPage implements Task {
    private final String url;

    public OpenPage(String url) {
        this.url = url;
    }

    public static Task loadPage(String url) {
        return Tasks.instrumented(OpenPage.class, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url),
                MaximizePage.theWindow()
        );
    }
}
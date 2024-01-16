package com.nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;

public class MaximizePage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
        driver.manage().window().maximize();
    }

    public static Performable theWindow() {
        return Tasks.instrumented(MaximizePage.class);
    }
}
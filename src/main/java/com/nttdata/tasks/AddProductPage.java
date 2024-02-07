package com.nttdata.tasks;

import com.nttdata.userinterfaces.ShopPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductPage implements Task {
    public static Task addProductsToCart() { return instrumented(AddProductPage.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//                SE REALIZA LA ADICION DE PRODUCTOS Y BOTONES DE CONFIRMACION A BOTONES DE PAGO
                WaitUntil.the(ShopPageInterface.button_ADD_TO_CART_1, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.button_ADD_TO_CART_1),

                WaitUntil.the(ShopPageInterface.button_ADD_TO_CART_2, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ShopPageInterface.button_ADD_TO_CART_2),

                WaitUntil.the(ShopPageInterface.button_CART, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.button_CART),

                WaitUntil.the(ShopPageInterface.button_VIEW_CART, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.button_VIEW_CART),

                WaitUntil.the(ShopPageInterface.button_CHECKOUT, isVisible()).forNoMoreThan(20).seconds(),
                Scroll.to(ShopPageInterface.button_CHECKOUT),
                Click.on(ShopPageInterface.button_CHECKOUT),

                WaitUntil.the(ShopPageInterface.button_GUEST_CHECKOUT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.button_GUEST_CHECKOUT),

                WaitUntil.the(ShopPageInterface.button_CONTINUE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.button_CONTINUE)

        );
    }
}

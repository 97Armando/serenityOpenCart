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

public class AddProductPage implements Task{
    public static Task addProductsToCart(){ return instrumented(AddProductPage.class);}

    @Override
    public <T extends Actor>void perfomAs(T actor){
        actor.attemptsTo(
                //BUSCA LOS ELEMENTOS Y DA CLICK EN LOS IDENTIFICADOS PRODUCTO 1
                WaitUntil.the(ShopPageInterface.BTN_ADD_TO_CART_1,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_ADD_TO_CART_1),

                //BUSCA LOS ELEMENTOS Y DA CLICK EN LOS IDENTIFICADOS PRODUCTO 2
                WaitUntil.the(ShopPageInterface.BTN_ADD_TO_CART_2,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_ADD_TO_CART_2),

                //BUSCA LOS ELEMENTOS Y DA CLICK EN ICONO CARRITO
                WaitUntil.the(ShopPageInterface.BTN_CART,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_CART),

                //BUSCA LOS ELEMENTOS Y DA CLICK EN VER CARRITO
                WaitUntil.the(ShopPageInterface.BTN_VIEW_CART,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_VIEW_CART),

                //BUSCA LOS ELEMENTOS Y DA CLICK IR A PAGAR
                WaitUntil.the(ShopPageInterface.BTN_CHECKOUT,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_CHECKOUT),

                //BUSCA LOS ELEMENTOS Y DA CLICK EN COMPRAR COMO INVITADO
                WaitUntil.the(ShopPageInterface.BTN_GUEST_CHECKOUT,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_GUEST_CHECKOUT),

                //BUSCA LOS ELEMENTOS Y DA CLICK EN COMPRAR COMO INVITADO
                WaitUntil.the(ShopPageInterface.BTN_CONTINUE,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(ShopPageInterface.BTN_CONTINUE)



        );

    }
}


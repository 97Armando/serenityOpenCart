package com.nttdata.tasks;

import com.nttdata.userinterfaces.PurchasePageInterface;
import com.nttdata.userinterfaces.ShopPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseFormPage implements Task {

    public final String firstname;
    public final String lastname;
    public final String email;
    public final String telephone;
    public final String company;
    public final String address_1;
    public final String city;
    public final String postcode;
    public final String country;
    public final String region;

    public PurchaseFormPage(String firstname, String lastname, String email, String telephone, String company, String address_1, String city, String postcode, String country, String region) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.company = company;
        this.address_1 = address_1;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
        this.region = region;
    }

    public static Performable withData(String firstname, String lastname, String email, String telephone, String company, String address1, String city, String postcode, String countryId, String regionId) {
        return instrumented(PurchaseFormPage.class, firstname, lastname, email, telephone, company, address1, city, postcode, countryId, regionId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
// SE REALIZA EL PASO A PASO DEL INGRESO DE DATOS AL FORMULADIO Y LOS CLICK EN BOTONES CONTINUAR
                WaitUntil.the(PurchasePageInterface.input_FIRST_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(firstname).into(PurchasePageInterface.input_FIRST_NAME),

                WaitUntil.the(PurchasePageInterface.input_LAST_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(lastname).into(PurchasePageInterface.input_LAST_NAME),

                WaitUntil.the(PurchasePageInterface.input_EMAIL, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(email).into(PurchasePageInterface.input_EMAIL),

                WaitUntil.the(PurchasePageInterface.input_PHONE, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(telephone).into(PurchasePageInterface.input_PHONE),

                WaitUntil.the(PurchasePageInterface.input_COMPANY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(company).into(PurchasePageInterface.input_COMPANY),

                WaitUntil.the(PurchasePageInterface.input_ADDRESS, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(address_1).into(PurchasePageInterface.input_ADDRESS),

                WaitUntil.the(PurchasePageInterface.input_CITY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(city).into(PurchasePageInterface.input_CITY),

                WaitUntil.the(PurchasePageInterface.input_POST_CODE, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(postcode).into(PurchasePageInterface.input_POST_CODE),

                Scroll.to(PurchasePageInterface.OPT_REGION),

                WaitUntil.the(PurchasePageInterface.input_COUNTRY, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.input_COUNTRY),

                WaitUntil.the(PurchasePageInterface.input_REGION, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.input_REGION),

                WaitUntil.the(PurchasePageInterface.OPT_REGION, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.OPT_REGION),

                WaitUntil.the(PurchasePageInterface.button_CONTINUE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.button_CONTINUE),

                WaitUntil.the(PurchasePageInterface.button_SHIPPING, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.button_SHIPPING),

                WaitUntil.the(PurchasePageInterface.button_TERMS, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.button_TERMS),

                WaitUntil.the(PurchasePageInterface.button_CONTINUE2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.button_CONTINUE2),

                WaitUntil.the(PurchasePageInterface.button_CONF, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.button_CONF),
//                BOTON PARA FINALIZAR COMPRA
                WaitUntil.the(PurchasePageInterface.button_final, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.button_final)

        );
    }

}

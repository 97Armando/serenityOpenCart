package com.nttdata.glue;

import com.nttdata.tasks.AddProductPage;
import com.nttdata.tasks.OpenPage;
import com.nttdata.tasks.PurchaseFormPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginGlue {

    private static final String ACTOR_NAME = "USER";

    @Before
    public void setTheStag() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ESTOY EN LA PAGINA DE OPENCART$")
    public void login(String actor){
        theActorCalled(actor).attemptsTo(
                OpenPage.loadPage("http://opencart.abstracta.us/")
        );
    }

    @When("SELECCIONO UN PRODUCTO$")
    public void selectProduct(){
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                AddProductPage.addProductsToCart()
        );
    }

    @Then("AGREGO EL PRODUCTO AL CARRITO$")
    public void addProduct(){

    }

    @And("VEO EL CARRITO$")
    public void viewCart(){

    }

    @When("^INGRESO DATOS (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void form(
            String firstname,
            String lastname,
            String email,
            String telephone,
            String company,
            String address_1,
            String city,
            String postcode,
            String country,
            String region
    ){

        theActorInTheSpotlight().attemptsTo(
                PurchaseFormPage.withData(
                        firstname,
                        lastname,
                        email,
                        telephone,
                        company,
                        address_1,
                        city,
                        postcode,
                        country,
                        region
                )
        );

    }


    @Then("VEO NUEVO FORMULARIO")
    public void next(){

    }

}

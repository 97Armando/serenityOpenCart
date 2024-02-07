package com.nttdata.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopPageInterface {

    public static final Target button_ADD_TO_CART_1 = Target.the(("BOTON ADD prod. into cart")).located(By.xpath("//*[@id='content']/div[2]/div[1]/div/div[3]/button[1]"));
    public static final Target button_ADD_TO_CART_2 = Target.the(("BOTON ADD prod. into cart")).located(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[3]/button[1]"));

    public static final Target button_CART = Target.the(("BOTON CART")).located(By.xpath("//*[@id='cart']/button"));

    public static final Target button_VIEW_CART = Target.the(("BOTON VIEW CART")).located(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[1]"));
    public static final Target button_CHECKOUT = Target.the(("BOTON CHECKOUT")).located(By.xpath("//*[@id='content']/div[3]/div[2]/a"));
    public static final Target button_GUEST_CHECKOUT = Target.the(("BOTON GUEST CHECKOUT")).located(By.xpath("//*[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label/input"));

    public static final Target button_CONTINUE = Target.the(("BOTON CONTINUE")).located(By.xpath("//*[@id='button-account']"));
}
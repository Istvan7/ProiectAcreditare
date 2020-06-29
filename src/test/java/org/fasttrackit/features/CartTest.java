package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.ShopSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Steps
     ShopSteps shopSteps;
    @Steps
    CartSteps cartSteps;





    @Test
    public void addmultiplePriductsToCart(){
        shopSteps.addmultipleitemsToCart();
    }

    @Test
    public void addToCart(){
        shopSteps.openShop();
    shopSteps.addProdactsToCart();
    shopSteps.openCart();
    shopSteps.proccedToCheckoutisDisplayed();




    }
@Test
    public void chechpPices(){
        cartSteps.openShop();
        shopSteps.addProdactsToCart();
        shopSteps.openCart();
        cartSteps.chechIfPricesAreEqual();

    }
    @Test
    public void cartIcon() {
        shopSteps.checkCartIconNumer();
    }
}


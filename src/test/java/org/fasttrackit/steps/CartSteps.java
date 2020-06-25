package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.pages.ShopPage;

public class CartSteps  {
    private CartPage cartPage;
    private MyAccountPage myAccountPage;
    private ShopPage shopPage;


    @Step
    public void openShop(){
        shopPage.open();
    }
    public void opencart (){
        cartPage.open();
    }


}

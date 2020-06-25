package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ShopPage;

public class ShopSteps {
    private ShopPage shopPage;
    private HomePage homePage;
    private CartPage cartPage;


@Step
public void openShop(){
    shopPage.open();
}


    @Step
    public void sortBY(String SortBy){
        homePage.open();
        shopPage.open();
        shopPage.setSortBY(SortBy);
    }

    @Step
    public void addProdactsToCart() {
        shopPage.addproduct1();
        shopPage.addproduct2();
        shopPage.addproduct3();
        shopPage.addproduct4();
        shopPage.addproduct5();

    }
    @Step
    public void openCart(){
        cartPage.open();
    }

    @Step
    public void addmultipleitemsToCart(){
    shopPage.open();

    shopPage.clickCart();
    }

}

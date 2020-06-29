package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ShopPage;
import org.junit.Assert;

public class ShopSteps {
    private ShopPage shopPage;
    private HomePage homePage;
    private CartPage cartPage;


    @Step
    public void openShop() {
        shopPage.open();
    }


    @Step
    public void sortBY(String SortBy) {
        homePage.open();
        shopPage.open();
        shopPage.setSortBY(SortBy);
    }

    @Step
    public void addProdactsToCart() {
        shopPage.addproduct1();
        shopPage.addproduct2();
        shopPage.addproduct3();

    }

    @Step
    public void openCart() {
        cartPage.open();
    }

    @Step
    public void addmultipleitemsToCart() {
        shopPage.open();
        shopPage.addMultipleItemsToCart();
        homePage.open();
        homePage.clickCartButton();
    }

    @Step
    public void sortProductsByPrice(String sortBy) {
        shopPage.open();
        shopPage.setSortBY(sortBy);
        shopPage.sortbyPrice();


    }

    @Step
    public void checkSortByPrice() {
        Assert.assertTrue(shopPage.sortbyPrice());
    }


    @Step
    public void checkCartIconNumer() {
        homePage.open();
        homePage.clicShopButton();
        shopPage.addproduct1();
        homePage.open();
        homePage.getCartIconNumber();
        homePage.verifyCartIconNumber();
    }

    @Step
    public void proccedToCheckoutisDisplayed() {
        Assert.assertTrue(shopPage.proccedToCheckoutIsDisplayed());
    }

    @Step
    public void openbelt() {
        shopPage.openBeltProduct();
    }
}





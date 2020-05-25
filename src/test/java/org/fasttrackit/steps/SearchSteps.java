package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ShopPage;
import org.yecht.Data;

public class SearchSteps {
    private HomePage homePage;
    private ShopPage shopPage;



    @Step
    public void search(){
        homePage.open();

    }
    @Step
    public void searchIcon(String text){
        homePage.clickSearchIcon();
        homePage.typeSearchIcon(text);
    }
    @Step
    public void cart(){
        homePage.open();
        homePage.clicShopButton();
        shopPage.addproduct1();
        homePage.open();
        homePage.getCartIconNumber();
        homePage.verify();
    }
}

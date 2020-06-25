package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchPage;
import org.fasttrackit.pages.ShopPage;
import org.junit.Assert;
import org.yecht.Data;

public class SearchSteps {
    private HomePage homePage;
    private ShopPage shopPage;
    private SearchPage searchPage;



    @Step
    public void homepage(){
        homePage.open();

    }
    @Step
    public void searchIcon(String text){
        homePage.open();
        homePage.clicShopButton();
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

   @Step
    public void verifyAsscendingPrices(){
        Assert.assertTrue(searchPage.checkAsccendinPrice());

    }
    @Step
    public void sortBy(String SortBY){
        searchPage.setSortBySelect(SortBY);
    }
   //public void comparenumbers(){
     //   searchPage.checkNumbers();
    //}

 /*   public void compareNumbers(){
        Assert.assertTrue(searchPage.highestPriceInt()> searchPage.lowestPriceIt());
    }*/

 @Step
    public void veryfysearchbytext(String value){
     Assert.assertTrue(searchPage.findProductInGrid(value));

 }

}

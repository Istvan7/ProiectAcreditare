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
        homePage.clickSearchIcon();
        homePage.typeSearchIcon(text);

    }


   @Step
    public void verifyAsscendingPrices(){
        Assert.assertTrue(searchPage.checkAsccendinPrice());

    }
    @Step
    public void sortBy(String SortBY){
        searchPage.setSortBySelect(SortBY);
    }


 @Step
    public void veryfysearchbytext(String value){
     Assert.assertTrue(searchPage.findProductInGrid(value));

 }

}

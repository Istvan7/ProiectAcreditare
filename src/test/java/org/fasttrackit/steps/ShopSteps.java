package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ShopPage;

public class ShopSteps {
    private ShopPage shopPage;
    private HomePage homePage;


    @Step
    public void sortBY(String SortBy){
        homePage.open();
        shopPage.open();
        shopPage.setSortBY(SortBy);
    }
}

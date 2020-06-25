package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.steps.ShopSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchTest extends BaseTest {
    @Steps
    SearchSteps searchSteps;
    @Steps
    ShopSteps shopSteps;

    @Test
    public void search() {
        searchSteps.homepage();
        searchSteps.searchIcon("beanie");

    }

    @Test
    public void cartIcon() {
        searchSteps.cart();
    }

    @Test
    public void SortBY() {
        shopSteps.sortBY("Sort by newness");
    }


   /* @Test
    public void sortByPrice() {
        searchSteps.homepage();
        searchSteps.searchIcon("logo");
        //shopSteps.sortBY("Sort by price: low to high");
        searchSteps.sortBy("Sort by price: low to high");
       // searchSteps.verifyAsscendingPrices();
       // searchSteps.comparenumbers();
       // searchSteps.compareNumbers();
        searchSteps.verifyAsscendingPrices();
    }*/

   @Test
    public void searchByText(){
       String text ="90";
       searchSteps.searchIcon(text);
       searchSteps.veryfysearchbytext(text);

   }
}





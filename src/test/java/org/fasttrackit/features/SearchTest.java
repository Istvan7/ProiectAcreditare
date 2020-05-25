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
        searchSteps.search();
        searchSteps.searchIcon("beanie");

    }

    @Test
    public void cartIcon(){
        searchSteps.cart();
    }

    @Test
    public void SortBY(){
        shopSteps.sortBY("Sort by newness");
    }
}

package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.ShopSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class ShopTest extends BaseTest {
    @Steps
    ShopSteps shopSteps;

    @Test
    public void checkSortHighToLow(){


        shopSteps.sortProductsByPrice("Sort by price: high to low");
        shopSteps.checkSortByPrice();
    }


}

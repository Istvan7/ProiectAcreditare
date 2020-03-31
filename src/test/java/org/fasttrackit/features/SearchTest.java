package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchTest extends BaseTest {
    @Steps
    SearchSteps searchSteps;

    @Test
    public void search() {
        searchSteps.search();
        searchSteps.searchIcon("beanie");

    }
}

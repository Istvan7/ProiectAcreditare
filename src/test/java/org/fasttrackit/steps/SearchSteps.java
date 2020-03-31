package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.yecht.Data;

public class SearchSteps {
    private HomePage homePage;



    @Step
    public void search(){
        homePage.open();

    }
    @Step
    public void searchIcon(String text){
        homePage.clickSearchIcon();
        homePage.typeSearchIcon(text);
    }
}

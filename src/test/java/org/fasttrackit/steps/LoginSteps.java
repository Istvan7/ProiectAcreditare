package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;

public class LoginSteps {

   private HomePage homePage;


    @Step
    public void navigateToHomepage (){
        homePage.open();
        homePage.clickMyAccountButton();

    }

}

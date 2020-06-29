package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class RegisterSteps {
   private HomePage homePage;
   private MyAccountPage myAccountPage;

    @Step
    public void register(String email,String password ){
        homePage.open();
        homePage.clickMyAccountButton();
        myAccountPage.setRegisterEmailAdressField(email);
        myAccountPage.setRegisterPasswordField(password);
        myAccountPage.clickRegisterButton();
    }
    @Step
    public void checkRegistration(String expected){
        String message =myAccountPage.chechSuccesfullRegistrationOrLogin();
        Assert.assertEquals(expected,message);
    }

    @Step
    public void checkalreadyUsedEmailEror(String expected){
        String errorMassage =myAccountPage.getalreadyUsedEmailError();
        Assert.assertEquals(expected,errorMassage);
    }

}

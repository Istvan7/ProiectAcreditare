package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class LoginSteps {

   private HomePage homePage;
   private MyAccountPage myAccountPage;


    @Step
    public void navigateToMyAccount (){
        homePage.open();
        homePage.clickMyAccountButton();

    }
    @Step
    public void setcredentials(String email,String password){
        myAccountPage.setLoginEmailField(email);
        myAccountPage.setLoginPasswordField(password);


    }
    public void login(){
        myAccountPage.clickRememberMeCheckBox();
        myAccountPage.clickLoginButton();

    }
    @Step
    public void checkSuccesLogin(){
        Assert.assertEquals("Log out",myAccountPage.chechSuccesfullRegistrationOrLogin());
    }

    public void checkloginPasswordErrorMessage(){
        Assert.assertEquals("ERROR: The password you entered for the email address IstiF@malinator.com is incorrect. Lost your password?",myAccountPage.getWrongPasswordError());
    }

    public void checkloginEmailErrorMassage(){
        Assert.assertEquals("ERROR: Invalid email address. Lost your password?",myAccountPage.getWrongEamilError());
    }



}

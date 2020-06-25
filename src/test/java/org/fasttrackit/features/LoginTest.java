package org.fasttrackit.features;


import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest {
    private   Constants constants;
    @Steps
    LoginSteps loginSteps;



    @Test
    public void login() {
        loginSteps.navigateToMyAccount();
        loginSteps.setcredentials(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        loginSteps.login();
        loginSteps.checkSuccesLogin();
    }

    @Test
    public void loginWithWrongPassword() {
        loginSteps.navigateToMyAccount();
        loginSteps.setcredentials("IstiF@malinator.com","123456789!@#$%^&*()qwertyuiop22");
        loginSteps.login();
        loginSteps.checkloginPasswordErrorMessage();


    }
    @Test
    public void logInWithWrongEmail(){
        loginSteps.navigateToMyAccount();
        loginSteps.setcredentials("IstiF@malinator12345678.com","asdasdasdasdsad");
        loginSteps.login();
        loginSteps.checkloginEmailErrorMassage();

    }
}

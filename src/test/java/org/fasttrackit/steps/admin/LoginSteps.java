package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.admin.DashboardPage;
import org.fasttrackit.pages.admin.LoginPage;

public class LoginSteps {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    @Step
    public void login(String email, String password){
        loginPage.open();
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
        loginPage.clickLoginButton();
       // dashboardPage.selectProductsMenu();
     //   dashboardPage.clickAddNew();
    }
    public void clickProductMenu(){
        dashboardPage.selectProductsMenu();
    }
    public void clickAddNewProduct(){
        dashboardPage.clickAddNew();
    }


}

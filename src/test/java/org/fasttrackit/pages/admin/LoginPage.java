package org.fasttrackit.pages.admin;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/wp-admin/")
public class LoginPage extends PageObject {
    @FindBy(id = "user_login")
    private WebElementFacade emailField;
    @FindBy(id = "user_pass")
    private WebElementFacade passwordField;
    @FindBy(id = "wp-submit")
    private WebElementFacade loginButton;


    public void setEmailField(String email) {
        emailField.type(email);

    }
    public void  setPasswordField(String password){
        passwordField.type(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }

}

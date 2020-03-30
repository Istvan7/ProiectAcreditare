package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120")
public class MyAccountPage extends PageObject {
    @FindBy(id = "reg_email")
     private WebElementFacade registerEmailAdressField;
    @FindBy(id = "reg_password")
    private WebElementFacade registerPasswordField;
    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p.woocommerce-FormRow.form-row > button")
    private WebElementFacade registerButton;
    @FindBy(css = "p a[href*=\"logout\"]")
    private WebElementFacade succesfullRegistration;

    public void setRegisterEmailAdressField (String Email){
        registerEmailAdressField.type(Email);
    }
    public void setRegisterPasswordField(String password){
        registerPasswordField.type(password);

    }
    public void clickRegisterButton(){
        registerButton.click();
    }
    public String chechSuccesfullRegistration(){
        return succesfullRegistration.getText();
    }
}

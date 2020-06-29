package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=119")
public class CheckoutPage extends PageObject {
@FindBy(id = "billing_first_name")
    private WebElementFacade firstNamefield;
@FindBy(id = "billing_last_name")
    private WebElementFacade lastNamefield;
@FindBy(id = "billing_company")
    private WebElementFacade companiNamefield;
@FindBy(id = "select2-billing_country-container")
    private WebElementFacade selectCountryfield;
@FindBy(id = "billing_address_1")
    private WebElementFacade streetAddresField;
@FindBy(id = "billing_city")
    private WebElementFacade townAndCityfield;
@FindBy(id = "select2-billing_state-container")
    private WebElementFacade countyField;
@FindBy(id = "billing_postcode")
    private WebElementFacade postcodeOrZip;
@FindBy(id = "billing_phone")
    private WebElementFacade phoneNrField;
@FindBy(id = "billing_email")
    private WebElementFacade emailAdressField;
@FindBy(id = "ship-to-different-address-checkbox")
    private WebElementFacade shipToADifferentAdressButton;
@FindBy(id = "order_comments")
    private WebElementFacade orderNotes;
@FindBy(css = "#place_order")
private WebElementFacade placeorderButton;
@FindBy(css = "#post-119 > header > h1")
private WebElementFacade orderReceivedmMessage;
    @FindBy(css = ".woocommerce-NoticeGroup.woocommerce-NoticeGroup-checkout > ul > li")
    private WebElementFacade missingPhoneNumberMessage;



public void setFirstNamefield(String FirstName) {
    firstNamefield.type(FirstName);
}
public void setLastNamefield(String LastName){
    lastNamefield.type(LastName);
}
public void setCompaniNamefield(String CompaniName){
    companiNamefield.type(CompaniName);
}
public void setSelectCountryfield(){
    selectCountryfield.selectByVisibleText("Romania");
}
public void setStreetAddresField(String StreetAdress){
    streetAddresField.type(StreetAdress);
}
public void setTownAndCityfield(String Town){
    townAndCityfield.type(Town);

}
public void setCountyField(){
    countyField.selectByVisibleText("Cluj");
}
public void  setPostCodeOrZip (String zip){
    postcodeOrZip.type(zip);
}
public void setPhoneNrField(String PhoneNumber){
    phoneNrField.type(PhoneNumber);
}
public void setEmailAdressField(String Email){
    emailAdressField.type(Email);}

    public void clickPlaceOrderButton ()
{
    placeorderButton.click();
    }

    public void moveToforMessage(){

    moveTo(By.cssSelector("#place_order"));
    }

    public boolean orderReceivedmMessageIsDisplayed () {
        if (orderReceivedmMessage.isDisplayed()) ;
        return true;
    }
    public void mouseOverElement() {
        Actions action = new Actions(getDriver());
        WebElement element = getDriver().findElement(By.id("place_order"));
        action.moveToElement(element).perform();
    }

    public String message (){
   return orderReceivedmMessage.getText();
    }
    public void wait5sec() {
        int timeToWait = 5; //second
        System.out.print("Scanning");
        try {
            for (int i = 0; i < timeToWait; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    public String getMissingphoneNumberMessage(){
        return missingPhoneNumberMessage.getText();
    }

}






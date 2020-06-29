package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CheckoutPage;
import org.junit.Assert;

public class CheckoutSteps {
    private CheckoutPage checkoutPage;

    @Step
    public void checkout(String firstName, String lastName, String companyName, String streetNumber, String townOrCity, String zip, String phoneNumber, String email) {
        checkoutPage.open();
        checkoutPage.setFirstNamefield(firstName);
        checkoutPage.setLastNamefield(lastName);
        checkoutPage.setCompaniNamefield(companyName);
        checkoutPage.setStreetAddresField(streetNumber);
        checkoutPage.setTownAndCityfield(townOrCity);
        checkoutPage.setPostCodeOrZip(zip);
        checkoutPage.setPhoneNrField(phoneNumber);
        checkoutPage.setEmailAdressField(email);





    }
    @Step
    public void moveoverAndClick(){
        checkoutPage.mouseOverElement();
        checkoutPage.clickPlaceOrderButton();
        checkoutPage.wait5sec();
    }

    @Step
    public void checkOrderReceivedMessage(){
        Assert.assertTrue(checkoutPage.orderReceivedmMessageIsDisplayed());
    }

    public void checkOrderReceivedMessage(String expected){
        Assert.assertEquals(expected,checkoutPage.message());
    }
    public void checkMissingPhoneNumberMessage(String expected){
        Assert.assertEquals(expected,checkoutPage.getMissingphoneNumberMessage());
    }
}

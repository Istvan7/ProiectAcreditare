package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

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

}

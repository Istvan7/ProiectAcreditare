package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008")
public class HomePage extends PageObject {
@FindBy(css = "a[href*=\"id=120\"]")
   private WebElementFacade myAccountButton;


public void clickMyAccountButton(){
    myAccountButton.click();
}

}

package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=118")
public class CartPage extends PageObject {

    @FindBy(css = "td[class*=sub]")
    private List<WebElementFacade> listProductPrices;


   public List<Integer> getProductPrices() {
       for (WebElementFacade productPrice : listProductPrices) {
           productPrice.findBy(By.cssSelector("span[class*='woocommerce-Price-amount amount']")).getText().replace(".00 lei", "");


       }
       return getProductPrices();

   }







}



package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import javax.swing.text.html.CSS;
import java.util.List;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=118")
public class CartPage extends PageObject {


    @FindBy(css = "form > table > tbody")
    private List<WebElementFacade> cartItemsPrices;
    @FindBy(css = "tr:nth-child(1) > td.product-price")
    private WebElementFacade firstPrice;
    @FindBy(css = "tr:nth-child(2) > td.product-price")
    private  WebElementFacade secondPrice;
    @FindBy(css = "tr:nth-child(3) > td.product-price")
    private WebElementFacade thirdPrice;
    @FindBy(css = "#post-118 > div > div > div > div > table > tbody > tr.shipping > td > span")
    private WebElementFacade shippingPrice;
    @FindBy(css = "#post-118 > div > div > div > div > table > tbody > tr.order-total > td > strong > span")
    private WebElementFacade totalPrice;




    private int getPriceFromElement(WebElementFacade element) {
        String priceAsString = element
                .findBy(By.cssSelector("#post-118 > div > div > form > table > tbody > tr:nth-child(1) > td.product-price > span")).getText()
                .replace(",00 lei", "");
        return Integer.parseInt(priceAsString);
    }



    public int firstPriceInt(){

        return Integer.parseInt(firstPrice.getText().replace(",00 lei",""));
    }
    public int secondPriceInt(){

        return Integer.parseInt(secondPrice.getText().replace(",00 lei",""));
    }
    public int thirdPriceInt(){
        return Integer.parseInt(thirdPrice.getText().replace(",00 lei",""));
    }

    public int total(){
        return Integer.parseInt(totalPrice.getText().replace(",00 lei",""));
    }
    public int shippingPriceInt(){
        return Integer.parseInt(shippingPrice.getText().replace(",00 lei",""));
    }
public int sumOfPrices(){
        return firstPriceInt()+secondPriceInt()+thirdPriceInt()+shippingPriceInt();
}



}



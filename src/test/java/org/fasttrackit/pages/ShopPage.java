package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.NoSuchElementException;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?post_type=product")
public class ShopPage extends PageObject {

    @FindBy(css = "a[data-product_id*=\"73\"]")
    private WebElementFacade product1;
    @FindBy(css = "select[class*='orderby']")
    private WebElementFacade sortBY;
    @FindBy(css = "a[data-product_id*=\"48\"]")
    private WebElementFacade product2;
    @FindBy(css = "a[data-product_id*=\"85\"]")
    private WebElementFacade product3;
    @FindBy(css = "a[data-product_id*=\"46\"]")
    private WebElementFacade product4;
    @FindBy(css = "a[data-product_id*=\"62\"]")
    private WebElementFacade product5;
    @FindBy(css = ".type-product")
    private List<WebElementFacade> container;
    @FindBy(css = "[aria-label*='to your cart']")
    private WebElementFacade addToCartButton;
    @FindBy(id = "menu-item-124")
    private WebElementFacade cartButton;
    @FindBy(css = ".cart-item-number")
    private WebElementFacade cartItemNumber;
    @FindBy(css = "p.return-to-shop")
    private WebElementFacade returnToShoppButton;
    @FindBy(css = ".checkout-button")
    private WebElementFacade proccedToCheckout;
    @FindBy(css = ".add_to_cart_button")
    private WebElementFacade clickOnAddToCart;
    @FindBy(css = "a[data-product_id*=\"58\"]")
    private WebElementFacade beltProduct;


    public void addproduct1() {
        product1.click();
    }

    public void setSortBY(String SortBy) {
        sortBY.selectByVisibleText(SortBy);
    }

    public void addproduct2() {
        product2.click();
    }

    public void addproduct3() {
        product3.click();
    }

    public void addproduct4() {
        product4.click();
    }

    public void addproduct5() {
        product5.click();
    }

    public boolean addMultipleItemsToCart() {
        for (WebElementFacade item : container) {
            if (item.findBy(By.cssSelector(".add_to_cart_button")).isClickable()) {
                clickOn(item);
            }
            return true;

        }
        return false;
    }

    public boolean sortbyPrice() {
        int highestPrice = getPriceFromElement(container.get(0));
        int lowestPrice = getPriceFromElement(container.get(container.size() - 2));
        if (highestPrice >= lowestPrice) {
            return true;
        }
        return false;
    }

    private int getPriceFromElement(WebElementFacade element) {
        String priceAsString = element
                .findBy(By.cssSelector(".price")).getText()
                .replace(",00 lei", "");
        return Integer.parseInt(priceAsString);
    }

    public boolean cartIconNumberNot0() {
        int inconValue = Integer.parseInt(cartItemNumber.getText());
        if (inconValue != 0) ;
        return true;

    }

    public boolean proccedToCheckoutIsDisplayed() {
        if (proccedToCheckout.isDisabled()) ;
        return true;
    }
    public void openBeltProduct(){
        beltProduct.click();
    }



}




















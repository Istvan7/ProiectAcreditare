package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
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
    @FindBy(css = "#azera_shop_id_7CtYpxUlRU > div.azera_shop_grid_col_4.azera_shop_grid_column_1.azera_shop_grid_first")
    private List<WebElementFacade> container;
    @FindBy(css = "[aria-label*='to your cart']")
    private WebElementFacade addToCartButton;
    @FindBy(id = "menu-item-124")
    private WebElementFacade cartButton;


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

   /* public boolean addMultipleItemsToCart() {
        for (WebElementFacade item : container
        ) {assert item.click();
            /*{item.thenFindAll(By.cssSelector("[aria-label*='to your cart']"));{
            clickOn(item);
            clickOn(addToCartButton);
        }clickOn(addToCartButton);*/







    public void clickCart() {
        cartButton.click();
    }

}










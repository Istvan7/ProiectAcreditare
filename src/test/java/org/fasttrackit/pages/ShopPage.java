package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?post_type=product")
public class ShopPage extends PageObject {

    @FindBy(css = "a[data-product_id*=\"73\"]")
    private WebElementFacade product1;
    @FindBy(css = "select[class*='orderby']")
    private WebElementFacade sortBY;
    @FindBy(css = "#azera_shop_id_UfSIqJ6vli > div.azera_shop_grid_col_4.azera_shop_grid_column_1.azera_shop_grid_first > li > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > span.price > span:nth-child(1)")
    private WebElementFacade lowestPrice;



    public void addproduct1(){
        product1.click();
    }
    public void setSortBY(String SortBy){
        sortBY.selectByVisibleText(SortBy);
    }
   // public String getLowestPrice(){return lowestPrice.getText().replace(",00 lei","");
   // int a = Integer.parseInt(getLowestPrice())

    }




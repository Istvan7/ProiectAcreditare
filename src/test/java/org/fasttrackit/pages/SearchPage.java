package org.fasttrackit.pages;

import com.sun.xml.bind.v2.model.core.ID;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import java.util.List;

public class SearchPage extends PageObject {

    @FindBy(css = "#azera_shop_id_4IDuYsayi8 > div.azera_shop_grid_col_4.azera_shop_grid_column_1.azera_shop_grid_first > li > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > span.price > span:nth-child(1)")
    private WebElementFacade lowestPrice;
    @FindBy(css = "#azera_shop_id_R73aYpeLma > div.azera_shop_grid_col_4.azera_shop_grid_column_4.azera_shop_grid_last > li > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > span > span")
    private WebElementFacade highestPrice;
    @FindBy(css = "select[class*='orderby']")
    private WebElementFacade sortBySelect;
    @FindBy(css = "li[class*='type-product']")
    private List<WebElementFacade> listOfProducts;

    public void setSortBySelect(String SortBy) {
        sortBySelect.selectByVisibleText(SortBy);
    }

    public boolean checkAsccendinPrice() {
        String getlowestPrice = lowestPrice.getText();
        int lowestpriceInt = Integer.parseInt(getlowestPrice);

        String gethighestPrice = highestPrice.getText();
        int highestpriceInt = Integer.parseInt(gethighestPrice);
        if (lowestpriceInt < highestpriceInt)
            return false;
        else return true;
    }

    public boolean findProductInGrid(String text) {
        for (WebElementFacade product : listOfProducts) {
            if (product.findBy(By.cssSelector("[class*='product__title']")).getText().equals(text))
            return true;
        }
        return false;
    }
}














  /*  String getlprice =lowestPrice.getText().replace(",00 lei","");
    String gethprice = highestPrice.getText().replace(",00 lei","");
    int lowestPriceInteger = Integer.parseInt(getlprice);
    int highestPriceInteger = Integer.parseInt(gethprice);
    public void checkNumbers(){
        Assert.assertTrue(highestPriceInteger>lowestPriceInteger);
    }*/




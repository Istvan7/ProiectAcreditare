package org.fasttrackit.pages.admin;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NewProductPage extends PageObject {
    @FindBy (id = "title")
    private WebElementFacade productNameField;
    @FindBy(id = "_regular_price")
    private WebElementFacade regularPriceField;
    @FindBy(id = "_sale_price")
    private WebElementFacade salePriceField;
    @FindBy(id = "_tax_status")
    private WebElementFacade taxStatus;
    @FindBy(id = "_tax_class")
    private WebElementFacade taxClass;
    @FindBy(css = "#product_cat-25 > label")
    private WebElementFacade accesoriesCategory;
    @FindBy(id = "publish")
     private WebElementFacade publishButton;
    @FindBy (css = "[class*='product_title ']")
    private WebElementFacade productName;
    @FindBy(css = "#post-58 > td.name.column-name.has-row-actions.column-primary > strong > a")
    private WebElementFacade beltProduct;
    @FindBy(css = "[href*='inventory']")
    private WebElementFacade inventory;
    @FindBy(id = "_stock_status")
    private WebElementFacade stockStatus;
    @FindBy(css = "p.stock.out-of-stock")
    private WebElementFacade outOfStokStatus;



    public void setProductNameField(String name){
        productNameField.type(name);

    }
    public void setRegularPriceField(String regularPrice){
        regularPriceField.type(regularPrice);
    }
    public void setSalePrice(String salePrice){
        salePriceField.type(salePrice);
    }
    public void setTaxStatus(){
        taxStatus.selectByValue("none");
    }
    public void setTaxClass(){
        taxClass.selectByValue("zero-rate");
    }
    public void clickAccesoriesCategory(){
        accesoriesCategory.click();
    }
    public void clickPublishButton(){
        publishButton.click();
    }
    public String getProductName(){
        return productName.getText();

    }
    public void clickBeltProduct(){
        beltProduct.click();
   }
    public void clickInventory(){
        inventory.click();
    }
    public void setStockStatus(){
        stockStatus.selectByValue("outofstock");
    }
    public boolean getoutOfStockMessage(){
        outOfStokStatus.isDisplayed();
        return true;
    }

}

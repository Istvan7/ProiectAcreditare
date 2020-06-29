package org.fasttrackit.steps.admin;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.pages.SearchPage;
import org.fasttrackit.pages.admin.DashboardPage;
import org.fasttrackit.pages.admin.NewProductPage;
import org.junit.Assert;

public class NewProductSteps {
    private DashboardPage dashboardPage;
    private NewProductPage newProductPage;
    private SearchPage searchPage;
    @Step
    public void addNewProduct(String name, String regularPrice,String salePrice){
        newProductPage.setProductNameField(name);
        newProductPage.setRegularPriceField(regularPrice);
        newProductPage.setSalePrice(salePrice);
        newProductPage.setTaxStatus();
        newProductPage.setTaxClass();
        newProductPage.clickAccesoriesCategory();
        newProductPage.clickPublishButton();
    }

    @Step
    public void searchNewProduct (String name){
        searchPage.findProductInGrid(name);
    }

    @Step
    public void checkNewProduct(String name){
        Assert.assertEquals(newProductPage.getProductName(),name);
    }

    @Step
    public void accesInventory() {
        newProductPage.clickBeltProduct();
        newProductPage.clickInventory();
    }

    @Step
    public void changeToOutOfStock(){
        newProductPage.setStockStatus();
        newProductPage.clickPublishButton();
    }
    @Step
    public void checkOutOfStockMessage(){
        Assert.assertTrue(newProductPage.getoutOfStockMessage());
    }








}

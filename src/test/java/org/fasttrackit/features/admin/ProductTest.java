package org.fasttrackit.features.admin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.steps.ShopSteps;
import org.fasttrackit.steps.admin.LoginSteps;
import org.fasttrackit.steps.admin.NewProductSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class ProductTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private NewProductSteps newProductSteps;
    @Steps
    private SearchSteps searchSteps;
    @Steps
    private ShopSteps shopSteps;
    @Test
    public void createNewProduct(){
       String name ="Test Product";
        loginSteps.login("admin","parola11");
        loginSteps.clickProductMenu();
        loginSteps.clickAddNewProduct();
        newProductSteps.addNewProduct (name,"50","40");
        searchSteps.searchIcon(name);
        newProductSteps.searchNewProduct(name);

    }
    @Test
    public void settingItemOutOfStock(){
        loginSteps.login("admin","parola11");
        loginSteps.clickProductMenu();
       newProductSteps.accesInventory();
        newProductSteps.changeToOutOfStock();
        shopSteps.openShop();
        shopSteps.openbelt();
        newProductSteps.checkOutOfStockMessage();


    }



}

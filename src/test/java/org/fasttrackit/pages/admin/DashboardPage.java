package org.fasttrackit.pages.admin;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DashboardPage extends PageObject {
    @FindBy(css = "#menu-posts-product > a > div.wp-menu-name")
    private WebElementFacade productsMenu;
    @FindBy(css = "div.wrap > a:nth-child(2)")
    private WebElementFacade addNewButton;


    public void selectProductsMenu() {
        productsMenu.click();
    }

    public void clickAddNew() {
        addNewButton.click();
    }

}

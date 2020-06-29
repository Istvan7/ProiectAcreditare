package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://qa4.fasttrackit.org:8008")
public class HomePage extends PageObject {
    @FindBy(css = "a[href*=\"id=120\"]")
    private WebElementFacade myAccountButton;
    @FindBy(css = "a[href*=\"id=117\"]")
    private WebElementFacade shopButton;
    @FindBy(css = "li a[href*=\"id=118\"]")
    private WebElementFacade cartButton;
    @FindBy(css = "a[href*=\"id=119\"]")
    private WebElementFacade checkOutButton;
    @FindBy(css = "label > input")
    private WebElementFacade searchField;
    @FindBy(css = "div.header-search")
    private WebElementFacade searchIcon;
    @FindBy(css = "input[title*=\"Search \"]")
    private WebElementFacade searchIconField;
    @FindBy(css = "span[class*=\"fa\"]")
    private WebElementFacade cartIcon;
    @FindBy(css = "span[class*=\"number\"]")
    private WebElementFacade cartIconNumber;



    public void clickMyAccountButton() {
        myAccountButton.click();
    }

    public void clicShopButton() {
        shopButton.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public void clickCheckOutButton() {
        checkOutButton.click();
    }

    public void typeSearchField(String text) {
        searchField.typeAndEnter(text);
    }

    public void clickSearchIcon() {
        searchIcon.click();

    }

    public void typeSearchIcon(String text) {
        searchIconField.typeAndEnter(text);
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    public String getCartIconNumber() {
        return cartIconNumber.getText();
    }

    public void verifyCartIconNumber() {
        Assert.assertEquals("1", getCartIconNumber());
    }






}


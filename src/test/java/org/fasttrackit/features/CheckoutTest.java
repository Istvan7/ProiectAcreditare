package org.fasttrackit.features;

import com.ibm.icu.util.TimeUnit;
import com.ibm.icu.util.TimeUnitAmount;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.steps.ShopSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Before;
import org.junit.Test;

import java.sql.Time;

public class CheckoutTest extends BaseTest {
    @Steps
    CheckoutSteps checkoutSteps;
    @Steps
    ShopSteps shopSteps;
    Constants constants;

    @Before
    public void addProductsToCart() {
        shopSteps.openShop();
        shopSteps.addProdactsToCart();
    }

    @Test
    public void placeOrder()  {


        checkoutSteps.checkout("Feher", "Istvan", "asaszxczx", " 156", "Cluj", RandomStringUtils.randomAlphanumeric(6), "07" + RandomStringUtils.randomNumeric(8), Constants.USER_EMAIL);
        checkoutSteps.moveoverAndClick();
        //checkoutSteps.checkOrderReceivedMessage();
        checkoutSteps.checkOrderReceivedMessage("ORDER RECEIVED");

    }
    @Test
    public void chekoutWithoutPhonenNumber(){
        checkoutSteps.checkout("Feher", "Istvan", "asaszxczx", " 156", "Cluj", RandomStringUtils.randomAlphanumeric(6), "", Constants.USER_EMAIL);
        checkoutSteps.moveoverAndClick();
        checkoutSteps.checkMissingPhoneNumberMessage("Billing Phone is a required field.");
    }

}



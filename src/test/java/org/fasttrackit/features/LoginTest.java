package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {
   @Steps
    LoginSteps loginSteps;

    @Test
    public void Login(){
        loginSteps.navigateToHomepage();

    }
}

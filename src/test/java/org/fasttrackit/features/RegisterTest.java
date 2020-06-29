package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest {
    private   Constants constants;

    @Steps
    RegisterSteps registerSteps;
    @Test
    public void Register(){
        registerSteps.register(RandomStringUtils.randomAlphabetic(6)+"@mailinator.com","asdf652652652568498498498498498498498vsdbvksbvjkadfvjh+6+65+6256+$%^&");
        registerSteps.checkRegistration("Log out");

    }

    @Test
    public void alreadyUsedEmail(){
        registerSteps.register(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        registerSteps.checkalreadyUsedEmailEror("Error: An account is already registered with your email address. Please log in.");
    }
}

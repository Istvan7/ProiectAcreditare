package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Steps
    RegisterSteps registerSteps;
    @Test
    public void Register(){
        registerSteps.register("qweeerzcwq@mailinator.com","asdf652652652568498498498498498498498vsdbvksbvjkadfvjh+6+65+6256+$%^&");
        registerSteps.checkRegistration("Log out");

    }
}

package com.cybertek.step_definitions;

import com.cybertek.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDefinitions {

    Pages pages = new Pages();

    @Given("user logs in with following credentials <username> and <password>")
    public void user_logs_in_with_following_credentials_username_and_password(Map<String, String> values) {
        System.out.println(values);
        pages.loginPage().login(values.get("username"), values.get("password"));
    }

    @Then("Verify that user succesfully logged in")
    public void verify_that_user_succesfully_logged_in() {
        //  Assert.assertEquals(expected,  pages.dashboardPage().getPageSubTitle());

    }





}

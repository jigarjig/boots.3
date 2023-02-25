package com.boots.steps;

import com.boots.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static com.boots.browserfactory.ManageBrowser.driver;

public class HomeTest {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^i click on accept all cookies$")
    public void iClickOnAcceptAllCookies() {
        new HomePage().acceptAllCookies();
        driver.switchTo().defaultContent();
    }


}

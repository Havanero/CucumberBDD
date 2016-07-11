package com.bdd.test.cases;


import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class customer_registration {
    //WebDriver driver = new ChromeDriver();

    @Given("^a new customer is on the site$")
    public void a_new_customer_is_on_the_site() throws Throwable {
        System.out.println("testing...");
    }

    @When("^they decide to register$")
    public void they_decide_to_register() throws Throwable {
    }

    @Then("^they can fill out a form and send it to us$")
    public void they_can_fill_out_a_form_and_send_it_to_us() throws Throwable {

    }


}

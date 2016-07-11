package com.bdd.test.cases;

import com.bdd.StepRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.BeforeClass;

public class complete_registration extends StepRunner {

    @Before
    public void setUp() {
        System.out.println("Simple setup");
        System.out.println("num is " + num);
    }

    @After
    public void tearDown(){
        num=num+9;
    }


    @Given("^a new customer has completed the registration form$")
    public void a_new_customer_has_completed_the_registration_form() throws Throwable {
        num++;
    }

    @When("^we receive it$")
    public void we_receive_it() throws Throwable {
        num++;
    }

    @Then("^we send them a confirmation email$")
    public void we_send_them_a_confirmation_email() throws Throwable {
        num++;
    }

}

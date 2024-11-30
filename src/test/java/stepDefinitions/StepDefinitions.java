package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Before
    public void setUp()
    {
        System.out.println("It's a setup call");
    }

    @Given("I navigate to the url")
    public void i_navigate_to_the_url()
    {
        System.out.println(" Y I navigate to the url");
    }

    @When("I enter correct username and password")
    public void I_enter_correct_username_and_password()
    {
        System.out.println(" Y I enter correct username and password");
    }

    @Then("I should be able to see homepage")
    public void I_should_be_able_to_see_homepage()
    {
        System.out.println(" Y I should be able to see homepage");
    }

    @When("I enter correct username and password1")
    public void I_enter_correct_username_and_password1()
    {
        System.out.println(" Y I enter correct username and password1");
    }

    @After
    public void tearDown()
    {
        System.out.println("Its a teardown call");
    }
}

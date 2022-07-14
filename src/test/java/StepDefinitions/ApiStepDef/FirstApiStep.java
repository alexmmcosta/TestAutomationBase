package StepDefinitions.ApiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstApiStep {

    @Given("User is on log in page - Api")
    public void something() {
        System.out.println("User is on log in page - Api");
    }

    @When("User enters valid credentials - Api")
    public void userEntersValidCredentialsApi() {
        System.out.println("User enters valid credentials");
    }

    @And("Clicks submit - Api")
    public void clicksSubmitApi() {
        System.out.println("Clicks submit");
    }

    @Then("User should login - Api")
    public void userShouldLoginApi() {
        System.out.println("User should login");
    }
}

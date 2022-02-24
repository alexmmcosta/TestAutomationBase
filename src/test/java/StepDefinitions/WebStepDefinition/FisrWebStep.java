package StepDefinitions.WebStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FisrWebStep {

    @Given("User is on log in page - Web")
    public void something() {
        System.out.println("User is on log in page - Web");
    }

    @When("User enters valid credentials - Web")
    public void userEntersValidCredentialsWeb() {
        System.out.println("User enters valid credentials");
    }

    @And("Clicks submit - Web")
    public void clicksSubmitWeb() {
        System.out.println("Clicks submit");
    }

    @Then("User should login - Web")
    public void userShouldLoginWeb() {
        System.out.println("User should login");
    }
}

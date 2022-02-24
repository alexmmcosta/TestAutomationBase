package StepDefinitions.IOSStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FisrIOSStep {

    @Given("User is on log in page - iOS")
    public void something() {
        System.out.println("User is on log in page - iOS");
    }

    @When("User enters valid credentials - iOS")
    public void userEntersValidCredentialsIOS() {
        System.out.println("User enters valid credentials");
    }

    @And("Clicks submit - iOS")
    public void clicksSubmitIOS() {
        System.out.println("Clicks submit");
    }

    @Then("User should login - iOS")
    public void userShouldLoginIOS() {
        System.out.println("User should login");
    }
}

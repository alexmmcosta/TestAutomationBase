package StepDefinitions.AndroidStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstAndroidStep {

    @Given("User is on log in page - Android")
    public void something() {
        System.out.println("User is on log in page - Android");
        System.out.println(System.getProperty("user.home"));
    }

    @When("User enters valid credentials - Android")
    public void userEntersValidCredentialsAndroid() {
        System.out.println("User enters valid credentials");
    }
    
    @And("Clicks submit - Android")
    public void clicksSubmitAndroid() {
        System.out.println("Clicks submit");
    }

    @Then("User should login - Android")
    public void userShouldLoginAndroid() {
        System.out.println("User should login");
    }
}

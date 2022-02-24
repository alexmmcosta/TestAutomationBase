package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/webFeatures" ,
        glue = "StepDefinitions/WebStepDefinition", dryRun = true,
        plugin = {"pretty","json:target/cucumberWeb.json","html:target/cucumberWeb.html"}
)
public class WebRun extends AbstractTestNGCucumberTests {

}

package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/webFeatures" ,
        glue = "StepDefinitions/WebStepDef", dryRun = true,
        plugin = {"pretty","json:target/cucumberWeb.json","html:target/cucumberWeb.html"},
        publish = true

)
public class WebRun extends AbstractTestNGCucumberTests {

}

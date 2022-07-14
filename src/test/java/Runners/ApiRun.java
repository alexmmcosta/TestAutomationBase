package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/apiFeatures" ,
        glue = "StepDefinitions/ApiStepDef", dryRun = true,
        plugin = {"pretty","json:target/cucumberApi.json","html:target/cucumberApi.html"},
        publish = true

)

public class ApiRun extends AbstractTestNGCucumberTests {
}

package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/apiFeatures" ,
        glue = "StepDefinitions/ApiStepDefinition", dryRun = true,
        plugin = {"pretty","json:target/cucumberApi.json","html:target/cucumberApi.html"}
)

public class ApiRun extends AbstractTestNGCucumberTests {
}

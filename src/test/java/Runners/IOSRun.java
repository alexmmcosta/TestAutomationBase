package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/iosFeatures" ,
        glue = {"StepDefinitions/IOSStepDef"}, dryRun = true,
        plugin = {"pretty","json:target/cucumberIOS.json","html:target/cucumberIOS.html"},
        publish = true

)

public class IOSRun extends AbstractTestNGCucumberTests {
}

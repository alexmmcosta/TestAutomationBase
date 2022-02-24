package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/androidFeatures" ,
        glue = "StepDefinitions/AndroidStepDefinition", dryRun = true,
        plugin = {"pretty","json:target/cucumberAndroid.json","html:target/cucumberAndroid.html"}
)

public class AndroidRun extends AbstractTestNGCucumberTests {
}

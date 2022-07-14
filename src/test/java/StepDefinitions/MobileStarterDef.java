package StepDefinitions;

import Starter.GlobalStarter;
import io.cucumber.java.en.Given;

public class MobileStarterDef extends GlobalStarter{

    @Given("^user has started the Application - iOS$")
    public void startIOSApp() {

        // Starts Appium Server
        appiumStarter();
        // Starts the App
        iOSStarter();

    }

    @Given("^user has started the Application - Android$")
    public void startAndroidApp() {

        // Starts Appium Server
        appiumStarter();
        // Starts the App
        androidStarter();

    }
}

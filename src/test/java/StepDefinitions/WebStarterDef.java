package StepDefinitions;

import Starter.GlobalStarter;
import io.cucumber.java.en.Given;

import java.io.IOException;

public class WebStarterDef extends GlobalStarter{

    @Given("^user has started the Application - Web$")
    public void startIOSApp() throws IOException {

        // Starts the WebApp
        webStarter();

    }
}

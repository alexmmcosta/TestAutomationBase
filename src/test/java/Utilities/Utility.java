package Utilities;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

    // Basic Variables
    private static WebDriverWait wait;
    private static TouchAction touch;

    public static WebDriverWait getWait() {
        return wait;
    }

    private static TouchAction getTouch() {
        return touch;
    }

}

package MobilePOM;

import Utilities.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePOM {

    public AppiumDriver<MobileElement> driver;
    public static WebDriverWait waitVar = null;

    public BasePOM(AppiumDriver<MobileElement> driver)
    {
        this.driver = driver;
        waitVar = Utility.getWait();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}

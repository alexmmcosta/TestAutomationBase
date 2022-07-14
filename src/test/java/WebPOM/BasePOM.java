package WebPOM;


import Utilities.Utility;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePOM {

    public WebDriver driver;
    public static WebDriverWait waitVar = null;

    public BasePOM(WebDriver driver)
    {
        this.driver = driver;
        waitVar = Utility.getWait();
       // PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}

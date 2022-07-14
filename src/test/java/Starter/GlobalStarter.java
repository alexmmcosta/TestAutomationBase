package Starter;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalStarter {

    public static WebDriver driver;
    public static AppiumDriverLocalService service;

    public static void webStarter() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/Starter/test.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            driver = new ChromeDriver();
        }
        else if (browserName.equals("firefox")) {
            // add funcionality
            driver = new FirefoxDriver();

        }
        else if (browserName.equals("edge")) {
            // add funcionality
            driver = new EdgeDriver();

        }
        else if (browserName.equals("safari")) {
            // add funcionality
            driver = new SafariDriver();

        }
    }

    public static void appiumStarter() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    public static void iOSStarter() {
        DesiredCapabilities cap = new DesiredCapabilities();
        File appDir = new File(System.getProperty("user.dir") + "ios.app");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ios.device"); // iPhone Simulator Being Used
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "ios.version"); // iOS Version Being Used in Simulator
        cap.setCapability(MobileCapabilityType.APP, appDir);
    }

    public static void androidStarter() {
        DesiredCapabilities cap = new DesiredCapabilities();

        File appDir = new File("src", "android.apk");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "android.device.name"); // Emulator Name
        cap.setCapability(MobileCapabilityType.APP, appDir);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
    }

}

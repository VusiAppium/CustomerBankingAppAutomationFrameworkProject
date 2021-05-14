package UIAutomationTesting.ANDROID.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SetupCustomerCapabilitiesAndroid
{

    public static AndroidDriver<AndroidElement> driver;


    @Test
    public AndroidDriver<AndroidElement> setup(String deviceName,String udid,String platformName,String platformVersion,String appPackage,String appActivity) throws MalformedURLException {

        File appDir = new File("src");
        File app = new File(appDir,"ApiDemons.apk");

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
        cap.setCapability("udid",udid);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,platformName);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
        cap.setCapability("appPackage",appPackage);
        cap.setCapability("appActivity",appActivity);
        cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }
}

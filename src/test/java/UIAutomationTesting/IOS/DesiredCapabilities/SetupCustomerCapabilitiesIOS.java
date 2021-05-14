package UIAutomationTesting.IOS.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SetupCustomerCapabilitiesIOS
{

    public static IOSDriver<IOSElement> driver;


    public IOSDriver<IOSElement> setup(String deviceName, String udid, String platformName, String platformVersion) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();



        cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
        cap.setCapability("udid",udid);
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,platformName);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        cap.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 500000);
        cap.setCapability("commandTimeouts", "12000");
        cap.setCapability(MobileCapabilityType.APP,"/Users/abvn237/Desktop/CustomerBankingAppProject/" +
                "IOSProject/CustomerBankingApp2/CustomerBankingApp2.app");

        //cap.setCapability("appPackage",appPackage);
        //cap.setCapability("appActivity",appActivity);

        IOSDriver driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"),cap);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementByAccessibilityId("Alert Views").click();

        driver.findElementByXPath("XCUIElementTypeStaticText[@name='Text Entry']").click();
        driver.findElementByXPath("//XCUIElementTypeCell").sendKeys("Hello");
        driver.findElementByAccessibilityId("OK").click();
        driver.findElementByAccessibilityId("Confirm / Cancel").click();
        System.out.println(driver.findElementByXPath("//*[contains[@name,'message']]").getText());
        driver.findElementByAccessibilityId("Confirm").click();



        return driver;
    }
}

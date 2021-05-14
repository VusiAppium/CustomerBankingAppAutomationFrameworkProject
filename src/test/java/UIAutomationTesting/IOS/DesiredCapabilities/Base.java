package UIAutomationTesting.IOS.DesiredCapabilities;

import UIAutomationTesting.ANDROID.DesiredCapabilities.SetupCustomerCapabilitiesAndroid;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.io.File;
import java.net.MalformedURLException;

public class Base
{
    public static IOSDriver<IOSElement> capabilities() throws MalformedURLException
    {
        IOSDriver<IOSElement> driver;

        File appDir = new File("src");
        File app = new File(appDir,"");

        SetupCustomerCapabilitiesIOS capabilitiesIOS = new SetupCustomerCapabilitiesIOS();

        //driver = capabilitiesAndroid.setup("","","","","","");

        driver = capabilitiesIOS.setup("","","","");

        return driver;
    }
}

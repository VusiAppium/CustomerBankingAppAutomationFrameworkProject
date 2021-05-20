package UIAutomationTesting.IOS.UITesting.LongPresses;

import UIAutomationTesting.IOS.DesiredCapabilities.SetupCustomerCapabilitiesIOS;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class LongPressTap extends SetupCustomerCapabilitiesIOS
{
    @Test
    public void longPress() throws MalformedURLException {
        IOSDriver driver = setup("iPhone 11 Pro Max","","IOS","11");
        MobileElement e = (MobileElement) driver.findElementByName("Long tap");

        IOSTouchAction touch = new IOSTouchAction(driver);

        touch.longPress(LongPressOptions.longPressOptions().withElement(element(e)).withDuration(Duration.ofSeconds(2)))
        .release().perform();

        MobileElement tap = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSwitch[1]");

        touch.tap(TapOptions.tapOptions().withElement(element(tap))).perform();


    }
}

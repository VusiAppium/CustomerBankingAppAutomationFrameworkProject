package UIAutomationTesting.IOS.UITesting.LongPresses;

import UIAutomationTesting.IOS.DesiredCapabilities.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.LongPressOptions;

import java.net.MalformedURLException;


import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class LongPress extends Base
{
    public void longPressTesting(IOSDriver<IOSElement> driver) throws MalformedURLException {
       driver = capabilities();

        MobileElement e = (MobileElement) driver.findElementByName("Long tap");

        IOSTouchAction touch = new IOSTouchAction(driver);

        touch.longPress(LongPressOptions.longPressOptions().withElement(element(e)).withDuration(ofSeconds(2)))
                .release().perform();

    }
}

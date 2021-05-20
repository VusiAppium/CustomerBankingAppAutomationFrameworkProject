package UIAutomationTesting.IOS.UITesting.SliderTests;

import UIAutomationTesting.IOS.DesiredCapabilities.Base;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.Assert;

import java.net.MalformedURLException;

public class SliderTest extends Base
{
    public void sliderTesting(IOSDriver<IOSElement> driver) throws MalformedURLException {
         driver = capabilities();

         driver.findElementByAccessibilityId("Sliders").click();
         driver.findElementByXPath("//XCUIElementTypeSlider");

         IOSElement slider = (IOSElement) driver.findElementByXPath("//XCUIElementTypeSlider");

         slider.setValue("0%");
         slider.setValue("1%");

         slider.getAttribute("value");

        Assert.assertEquals("100%",slider.getAttribute("value"));

    }
}

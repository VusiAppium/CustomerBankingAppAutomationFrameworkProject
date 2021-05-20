package UIAutomationTesting.IOS.UITesting.ClickTests;

import UIAutomationTesting.IOS.DesiredCapabilities.Base;
import UIAutomationTesting.IOS.DesiredCapabilities.SetupCustomerCapabilitiesIOS;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AddressDetailsClickTest extends Base
{
    @Test
    public void clickTesting() throws MalformedURLException {
        IOSDriver driver = capabilities();

        SetupCustomerCapabilitiesIOS capabilitiesIOS = new SetupCustomerCapabilitiesIOS();

        capabilitiesIOS.setup("iPhone 11","","IOS","13.3");
        driver.findElementByAccessibilityId("XCUIElementTypeButton[@name='Next']").click();

    }

    public void getElementByAccessibilityId(IOSDriver<IOSElement> driver)
    {
        driver.findElementByAccessibilityId("XCUIElementTypeStaticText[@name='Text Entry']").click();

    }

    public void getElementsByXPath(IOSDriver<IOSElement> driver)
    {
        driver.findElementByXPath("//XCUIElementTypeTextField").sendKeys("Hello");
        driver.findElementByXPath("//XCUIElementTypeTextLabel").sendKeys("Hello");

        driver.findElementByXPath("//[@contains(name,'message')]").getText();
        
        driver.findElementByXPath("//XCUIElementTypeTextButton").click();
    }
}

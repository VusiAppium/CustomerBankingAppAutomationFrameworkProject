package UIAutomationTesting.IOS.TestNG;

import UIAutomationTesting.IOS.DesiredCapabilities.SetupCustomerCapabilitiesIOS;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.HashMap;

public class ScrollTest extends SetupCustomerCapabilitiesIOS
{
    @Test
    public void scroll() throws InterruptedException, MalformedURLException {
        IOSDriver driver = setup("iPhone 11 Pro Max","","IOS","11");

        HashMap<String,Object> scrollObject = new HashMap<>();

        scrollObject.put("direction","down");

        scrollObject.put("name","Web View");



        driver.executeScript("mobile:scroll",scrollObject);

        driver.findElementByAccessibilityId("Web View").click();

        Thread.sleep(3000);

        driver.findElementByXPath("//XCUIElementTypeButton[@name='UIKitCatalog']").click();
        driver.findElementByAccessibilityId("Picker View").click();
        driver.findElementByAccessibilityId("Red color component value").sendKeys("80");
        driver.findElementByAccessibilityId("Green color component value").sendKeys("220");
        driver.findElementByAccessibilityId("Blue color component value").sendKeys("105");

        System.out.println(driver.findElementByAccessibilityId("Blue color component value").getText());

    }
}

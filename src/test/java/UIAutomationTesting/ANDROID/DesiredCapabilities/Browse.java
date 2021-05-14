package UIAutomationTesting.ANDROID.DesiredCapabilities;

import UIAutomationTesting.ANDROID.DesiredCapabilities.BaseChrome;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Browse extends BaseChrome
{
    @Test
    public void testBrowser() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.get("http://facebook.com");
        driver.findElementByXPath("//*[@id='u_0_1']/div/input").sendKeys("qwerty");
        driver.findElementByName("pass").sendKeys("12345");
        driver.findElementByXPath("//button[@value='Log In']");
    }
}

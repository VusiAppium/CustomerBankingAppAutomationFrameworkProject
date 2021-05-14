package UIAutomationTesting.ANDROID.TestNG;

import UIAutomationTesting.ANDROID.DesiredCapabilities.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class MainScreenUITesting extends Base
{
    public static AndroidDriver<AndroidElement> driver;

    @Test
    public void mainScreenUITest() throws MalformedURLException {
       driver = capabilities();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.findElementsByXPath("android.widget.Button").get(1).click();

    }
}

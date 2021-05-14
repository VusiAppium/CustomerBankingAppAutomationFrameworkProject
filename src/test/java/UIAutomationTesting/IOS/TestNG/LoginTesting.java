package UIAutomationTesting.IOS.TestNG;

import UIAutomationTesting.IOS.DesiredCapabilities.Base;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class LoginTesting extends Base
{
    @BeforeClass
    public void beforeRegistrationClass()
    {

    }

    @BeforeMethod
    public void beforeLoginMethod()
    {

    }

    @AfterTest
    public void preSignInTesting()
    {

    }



    @Test
    public void signInTesting() throws MalformedURLException {
        IOSDriver<IOSElement> driver = capabilities();

        //driver.findElementByAccessibilityId()
    }

    @AfterMethod
    public void afterLoginMethod()
    {

    }

    @AfterTest
    public void postSignInTesting()
    {

    }

    @AfterClass
    public void afterRegistrationClass()
    {

    }
}

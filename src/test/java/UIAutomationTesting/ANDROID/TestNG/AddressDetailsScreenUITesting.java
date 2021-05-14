package UIAutomationTesting.ANDROID.TestNG;

import UIAutomationTesting.ANDROID.DesiredCapabilities.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class AddressDetailsScreenUITesting extends Base
{
    AndroidDriver<AndroidElement> driver;
    @BeforeClass
    public void beforeAddressDetailsClass()
    {

    }

    @BeforeMethod
    public void beforeAddressDetailsMethod()
    {

    }
    @BeforeTest
    public void preAddressDetails()
    {

    }
    @Test
    public void addressDetailsUITesting() throws MalformedURLException {
        driver = capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElementById("android:id/edtAddressLine1").sendKeys("User1");
        driver.findElementById("android:id/edtAddressLine2").sendKeys("Password01#");
        driver.findElementById("android:id/btnNext").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Email Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Id Number Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Sign In']").click();
        driver.findElementsByClassName("android.widget.EditText").get(1).click();
        driver.findElementsByClassName("android.widget.LinearLayout").get(1).click();


    }

    @AfterMethod
    public void afterAddressDetailsMethod()
    {

    }

    @AfterTest
    public void postAddressDetails()
    {

    }

    @AfterClass
    public void afterAddressDetailsClass()
    {

    }
}

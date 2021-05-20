package UIAutomationTesting.ANDROID.UITesting;

import UIAutomationTesting.ANDROID.DesiredCapabilities.Base;
import UIAutomationTesting.ANDROID.DesiredCapabilities.SetupCustomerCapabilitiesAndroid;
import UIAutomationTesting.ANDROID.Elements.WorkScreenElements;
import UIAutomationTesting.ANDROID.Models.Work;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class WorkDetailsScreenUITesting extends Base
{
    public AndroidDriver<AndroidElement> driver;
    public TouchAction touchAction;

    public Set<String> contexts;

    private static Logger log = LogManager.getLogger(WorkDetailsScreenUITesting.class.getName());

    public WorkScreenElements workDetailsScreen;

    @BeforeClass
    public void beforeAddressDetailsClass()
    {

    }

    @BeforeMethod
    public void beforeAddressDetailsMethod() throws MalformedURLException {

        driver = capabilities();

        SetupCustomerCapabilitiesAndroid caps = new SetupCustomerCapabilitiesAndroid();

        caps.setup("emulator-54444","","ANDROID","5.1",
                "com.example.appiumtwo","WorkDetailsActivity");

        log.info("set work details capabilities");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        log.info("Managing implicit timeouts");

        touchAction = new TouchAction(driver);

    }
    @BeforeTest
    public void preAddressDetails()
    {

    }
    @Test
    public void addressDetailsUITesting() throws MalformedURLException, InterruptedException {


        workDetailsScreen = new WorkScreenElements();

        workDetailsScreen.getElementsByXPath(driver);
        //getElementsById(driver);

        log.info("Finding elements by id");




        //getElementsByXPath(driver);

        log.info("Finding elements by xpath");

        //getElementsByClassName(driver,1);

        log.info("Finding elements by class name");

        //getLongPressActions(driver,touchAction);

        log.info("Setting long press actions");

        //getTapOptions(driver,touchAction);

        log.info("Setting tap options");

        Thread.sleep(4000);

        getContextHandles(driver,contexts);
    }

    public void getContextHandles(AndroidDriver<AndroidElement> driver, Set<String> contexts)
    {
        for(String contextName : contexts)
        {
            System.out.println(contextName);
        }
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

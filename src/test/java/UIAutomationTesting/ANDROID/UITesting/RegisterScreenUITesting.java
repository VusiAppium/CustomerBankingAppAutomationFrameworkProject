package UIAutomationTesting.ANDROID.UITesting;

import UIAutomationTesting.ANDROID.DesiredCapabilities.Base;
import UIAutomationTesting.ANDROID.DesiredCapabilities.SetupCustomerCapabilitiesAndroid;
import UIAutomationTesting.ANDROID.Models.Register;
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

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class RegisterScreenUITesting extends Base
{
    private static Logger log = LogManager.getLogger(RegisterScreenUITesting.class.getName());

    public AndroidDriver<AndroidElement> driver;
    public Base base;
    public Set<String> contexts;



    public TouchAction touchAction;

    @BeforeClass
    public void beforeRegistrationClass() throws IOException {
        checkIfServerIsRunning(4723);
    }

    @BeforeMethod
    public void beforeRegistrationMethod() throws MalformedURLException {
        driver = capabilities();

        SetupCustomerCapabilitiesAndroid caps = new SetupCustomerCapabilitiesAndroid();

        caps.setup("emulator-54444","","ANDROID","5.1",
                "com.example.appiumtwo","RegisterActivity");

        log.info("set register capabilities");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        log.info("Manage implicit wait timeouts");
    }
    @BeforeTest
    public void killAllNodes() throws IOException, InterruptedException {
        startServer();
       Runtime.getRuntime().exec("taskkill /F  /IM node.exe  ");
       Thread.sleep(2000);
    }
    @Test
    public void registrationUITesting() throws MalformedURLException, InterruptedException {

        touchAction = new TouchAction(driver);

        ///getElementsById(driver);

        log.info("Find elements by id");

       // getElementsByName(driver);

        //getElementsByXPath(driver);

        log.info("Find elements by XPath");

        //getElementsByClassName(driver,1);

        log.info("Find elements by XPath");

        //getLongPressActions(driver,touchAction);

       // getTapOptions(driver,touchAction);

        Thread.sleep(4000);

        getContextHandles(driver,contexts);
    }



    public void getContextHandles(AndroidDriver<AndroidElement> driver, Set<String> contexts)
    {
         for(String contextName : contexts)
         {
             System.out.println(contextName);
         }

         driver.context("com.example.AppiuTwo");
         driver.context("NATIVE_APP");
    }

    @AfterMethod
    public void afterRegistrationMethod()
    {

    }

    @AfterTest
    public void postRegistration()
    {

    }

    @AfterClass
    public void afterRegistrationClass()
    {
        base.stop();
    }

    /*@DataProvider(name="InputData")
    public Object[][] getDataforEditField()
    {
        Object[][] obj = new Object[][];


    }*/
}

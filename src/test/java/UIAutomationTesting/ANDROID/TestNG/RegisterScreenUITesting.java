package UIAutomationTesting.ANDROID.TestNG;

import UIAutomationTesting.ANDROID.DesiredCapabilities.Base;
import UIAutomationTesting.ANDROID.DesiredCapabilities.SetupCustomerCapabilitiesAndroid;
import UIAutomationTesting.ANDROID.PageObjects.Main;
import UIAutomationTesting.ANDROID.Resources.TestData;
import UIAutomationTesting.IOS.DesiredCapabilities.SetupCustomerCapabilitiesIOS;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class RegisterScreenUITesting extends Base
{
    public AndroidDriver<AndroidElement> driver;
    public Base base;

    @BeforeClass
    public void beforeRegistrationClass() throws IOException {

        base = new Base();

        base.checkIfServerIsRunning(4723);
        base.startServer();


    }

    @BeforeMethod
    public void beforeRegistrationMethod()
    {

    }
    @BeforeTest
    public void killAllNodes() throws IOException, InterruptedException {
       Runtime.getRuntime().exec("taskkill /F  /IM node.exe  ");
       Thread.sleep(2000);
    }
    @Test
    public void registrationUITesting() throws MalformedURLException {
        driver = capabilities();

        SetupCustomerCapabilitiesAndroid caps = new SetupCustomerCapabilitiesAndroid();

        caps.setup("emulator-54444","","ANDROID","5.1",
                "com.example.appiumtwo","LoginActivity");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Main mainscreen = new Main(driver);

        driver.findElementById("android:id/edtName").sendKeys("User1");
        driver.findElementById("android:id/edtSurname").sendKeys("Password01#");
        driver.findElementById("android:id/btnSignUp").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Email Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Id Number Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Sign In']").click();
        driver.findElementsByClassName("android.widget.EditText").get(1).click();
        driver.findElementsByClassName("android.widget.LinearLayout").get(1).click();



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

    @DataProvider(name="InputData")
    public Object[][] getDataforEditField()
    {
        Object[][] obj = new Object[][];


    }
}

package UIAutomationTesting.ANDROID.UITesting;

import UIAutomationTesting.ANDROID.DesiredCapabilities.Base;
import UIAutomationTesting.ANDROID.DesiredCapabilities.SetupCustomerCapabilitiesAndroid;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class MainScreenUITesting extends Base
{
    private static Logger log = LogManager.getLogger(MainScreenUITesting.class.getName());

    public static AndroidDriver<AndroidElement> driver;
    public TouchAction touchAction;

    public Properties prop;

    @BeforeClass
    public void beforeLoginClass()
    {
        checkIfServerIsRunning(4723);
    }

    @BeforeMethod
    public void preMainTesting() throws MalformedURLException {
        driver = capabilities();

        SetupCustomerCapabilitiesAndroid caps = new SetupCustomerCapabilitiesAndroid();

        caps.setup("emulator-54444","","ANDROID","5.1",
                "com.example.appiumtwo","MainActivity");

        log.info("set register capabilities");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        log.info("Managing timeouts by using implicit wait");
    }

    @BeforeTest
    public void preLogin()
    {
        startServer();
    }

    @Test
    public void mainScreenUITest(String appName) throws IOException {

        FileInputStream fis = new FileInputStream("/Users/abvn237/Documents/" +
                "CustomersBankingSAAppFramework/src/test/java/UIAutomationTesting/ANDROID/Resources");
       prop = new Properties();
       prop.load(fis);
       prop.get("GeneralStoreApp");

       File appDir = new File("src");
       File app = new File(appDir,appName);


       //getElementsByClassName(driver,1);

       log.info("Finding elements by class name");

       //getTapOptions(driver,touchAction);

       log.info("Setting tap options");
    }



    @AfterMethod
    public void postMainTesting()
    {

    }
}

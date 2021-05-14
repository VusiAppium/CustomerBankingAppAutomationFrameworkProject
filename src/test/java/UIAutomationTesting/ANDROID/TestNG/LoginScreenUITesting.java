package UIAutomationTesting.ANDROID.TestNG;

import UIAutomationTesting.ANDROID.DesiredCapabilities.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class LoginScreenUITesting extends Base
{
    AndroidDriver<AndroidElement> driver;

    @BeforeClass
    public void beforeLoginClass()
    {

    }

    @BeforeMethod
    public void beforeLoginMethod()
    {

    }
    @BeforeTest
    public void preLogin()
    {

    }
    @Test
    public void loginUITesting() throws MalformedURLException {
       driver = capabilities();

       /*for(int i=0;i<2;i++)
       {
           driver.findElementsByXPath("android.widget.EditText").get(i).sendKeys("user1");
           driver.findElementsByXPath("android.widget.Button").get(i).click();
       }*/

       //driver.findElementByXPath("//android.widget.EditText[@id='edtUsername']").sendKeys("User1");
       //driver.findElementByXPath("//android.widget.EditText[@id='edtPassword']").sendKeys("Password01#");
       driver.findElementById("android:id/edtUsername").sendKeys("User1");
       driver.findElementById("android:id/edtPassword").sendKeys("Password01#");
       driver.findElementById("android:/btnSignIn").click();
       driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Username Here']").sendKeys("hello");
       driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Password Here']").sendKeys("hello");
       driver.findElementByXPath("//android.widget.EditText[@text='Sign In']").click();
       driver.findElementByClassName("android.widget.LinearLayout").click();







    }

    @AfterMethod
    public void afterLoginMethod()
    {

    }

    @AfterTest
    public void postLogin()
    {

    }

    @AfterClass
    public void afterLoginClass()
    {

    }
}

package UIAutomationTesting.IOS.UITesting.SwipeDemoTesting;

import UIAutomationTesting.ANDROID.DesiredCapabilities.Base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class SwipeDemoTest extends Base
{
    @Test
    public void swipeDemoTesting() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        //driver.findElementByXPath("//tagName[@attribute=value]");
        //driver.findElementByXPath("//*[@content-desc='15']")
        driver.findElementByXPath("//*[content-desc='9']").click();

        TouchAction t = new TouchAction(driver);

        WebElement first = driver.findElementByXPath("//[@content-desc='15']");
        WebElement second = driver.findElementByXPath("//[@content-desc='45']");

        t.longPress(LongPressOptions.longPressOptions().withElement(element(first)).withDuration(Duration.ofSeconds(2)))
                .moveTo(element(second)).release().perform();



    }
}

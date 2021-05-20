package UIAutomationTesting.ANDROID.Resources;

import UIAutomationTesting.ANDROID.DesiredCapabilities.Base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import jdk.internal.jline.internal.Log;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class Utilities extends Base
{
    public AndroidDriver driver;
    private static Logger log = LogManager.getLogger(Utilities.class.getName());

    public Utilities(AndroidDriver driver)
    {
        this.driver = driver;
    }

    public void scrollToText(String text)
    {
        driver.findElementByAndroidUIAutomator("new UIScrollable(new UISelector())." +
                "scrollIntoView(new UISelector().textMatches(\""+text+"\").instance(0))");
    }

    public void gestures() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        log.info("Managing timeouts");

        TouchAction t = new TouchAction(driver);
        WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expand Lists']");


        t.tap(TapOptions.tapOptions().withElement(element(expandList))).perform();
        //t.tap(TapOptions.tapOptions().withElement(element(expandList)).withPosition()

        driver.findElementByXPath("//android.widget.TextView[@text='Custom Adapter']").click();

        WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        t.longPress(LongPressOptions.longPressOptions().withElement(element(pn)).withDuration(Duration.ofSeconds(2))).release().perform();

        log.info("long press options");
        // t.press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(3);

        System.out.println(driver.findElementById("android:id/alertTitle").getText());
        //System.out.println(driver.findElementById("android:id/title").isDisplayed());
    }

    public void dragDrop() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        log.info("Capabilities has been set");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        log.info("Managing implicit wait timeouts");


        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();

        WebElement source = driver.findElementsByClassName("android.view.View").get(0);
        log.info("settinng source element");
        WebElement destination = driver.findElementsByClassName("android.view.View").get(0);
        log.info("setting destination element");


        TouchAction t = new TouchAction(driver);

        t.longPress(LongPressOptions.longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
        t.longPress(element(source)).moveTo(element(destination)).release().perform();
    }

    public void UiAutomator() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
    }

    public void getScreenshot(String s) throws IOException {
       File scrFile =  ((TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(scrFile,new File(System.getProperty("user.dir")+
               "\\"+));
    }
}

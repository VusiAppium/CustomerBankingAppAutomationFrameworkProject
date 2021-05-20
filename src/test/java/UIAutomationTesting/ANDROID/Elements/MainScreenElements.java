package UIAutomationTesting.ANDROID.Elements;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class MainScreenElements
{
    public void getElementsByClassName(AndroidDriver<AndroidElement> driver, int index)
    {
        driver.findElementsByXPath("android.widget.Button").get(index).click();
        driver.findElementsByXPath("android.widget.LinearLayout").get(index).click();
        driver.findElementsByXPath("androidx.constraintLayout.widget.ConstraintLayout").get(index).click();
    }

    public void getTapOptions(AndroidDriver<AndroidElement> driver, TouchAction touchAction)
    {
        WebElement ed = driver.findElement(By.xpath("android.widget.EditText"));
        WebElement ll = driver.findElement(By.xpath("android.widget.LinearLayout"));
        WebElement cl = driver.findElement(By.xpath("android.widget.Button"));

        touchAction.tap(TapOptions.tapOptions().withElement(element(ed))).release().perform();
        touchAction.tap(TapOptions.tapOptions().withElement(element(ll))).release().perform();
        touchAction.tap(TapOptions.tapOptions().withElement(element(cl))).release().perform();
    }
}

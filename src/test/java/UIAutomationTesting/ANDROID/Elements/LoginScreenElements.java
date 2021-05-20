package UIAutomationTesting.ANDROID.Elements;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class LoginScreenElements
{
    By username = By.id("android:id/edtUsername");
    By password = By.id("android:id/edtPassword");
    By signin = By.id("android:id/btnSignIn");

    public WebDriverWait wait;

    public void getElementsById(AndroidDriver<AndroidElement> driver)
    {
        //driver.findElementById("android:id/edtUsername").sendKeys("User1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys("User1");
        driver.hideKeyboard();
        //driver.findElementById("android:id/edtPassword").sendKeys("Password01#");
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("Password01#");
        driver.hideKeyboard();

        //driver.findElementById("android:id/btnSignIn").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(signin)).click();
    }

    public void getElementsByName(AndroidDriver<AndroidElement> driver)
    {
        driver.findElementByName("Vusi").sendKeys("User1");

        driver.findElementById("Ngwenya").sendKeys(Keys.ENTER);
        driver.findElementById("vusi@gmail.com").sendKeys(Keys.ENTER);
        driver.findElementById("0099696966").sendKeys(Keys.ENTER);
        driver.findElementById("Vusi").sendKeys(Keys.ENTER);
        driver.findElementById("Password1").sendKeys(Keys.ENTER);
        driver.findElementById("Password1").sendKeys(Keys.ENTER);

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void getElementsByXPath(AndroidDriver<AndroidElement> driver)
    {
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Username Here']").sendKeys("hello");
        driver.hideKeyboard();
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Password Here']").sendKeys("hello");
        driver.hideKeyboard();
        driver.findElementByXPath("//android.widget.EditText[@text='Sign In']").click();
    }

    public void getElementsByClassName(AndroidDriver<AndroidElement> driver,int index)
    {
        driver.findElementsByClassName("android.widget.EditText").get(index).click();
        driver.hideKeyboard();
        driver.findElementsByClassName("android.widget.LinearLayout").get(index).click();
        driver.findElementsByClassName("android.widget.Button").get(index).click();
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

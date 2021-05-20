package UIAutomationTesting.ANDROID.Elements;

import UIAutomationTesting.ANDROID.Models.Register;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class RegisterScreenElements
{

    public Register register;

    public void getElementsById(AndroidDriver<AndroidElement> driver)
    {
        register = new Register(driver);

        register.name.sendKeys("John");
        register.surname.sendKeys("Password01#");
        register.email.sendKeys("vusi@gmail.com");
        register.idNumber.sendKeys("8877887787");
        register.username.sendKeys("User1");
        register.password.sendKeys("Password01#");
        register.confirmPassword.sendKeys("Password01#");
        register.signUp.click();
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
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Name Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Surname Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Email Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your IDNumber Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Username Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Password Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Confirm Password Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Sign In']").click();
    }

    public void getElementsByClassName(AndroidDriver<AndroidElement> driver,int index)
    {
        driver.findElementsByClassName("android.widget.EditText").get(index).click();
        driver.findElementsByClassName("android.widget.LinearLayout").get(index).click();
    }

    public void getLongPressActions(AndroidDriver<AndroidElement> driver, TouchAction touchAction)
    {
        WebElement nEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Name Here']"));
        WebElement sEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Surname Here']"));
        WebElement eEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Email Here']"));
        WebElement idEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your IDNumber Here']"));
        WebElement uEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Username Here']"));
        WebElement pEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Password Here']"));
        WebElement cpEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Confirm Password Here']"));
        WebElement buttonsLongPress = driver.findElement(By.xpath("//android.widget.Button[@text='Next']"));

        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(nEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(sEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(eEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(idEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(uEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(pEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(cpEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(buttonsLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
    }

    public void getTapOptions(AndroidDriver<AndroidElement> driver, TouchAction touchAction)
    {
        WebElement ed = driver.findElement(By.xpath("android.widget.EditText"));
        WebElement ll = driver.findElement(By.xpath("android.widget.LinearLayout"));
        WebElement cl = driver.findElement(By.xpath("androidx.constraintlayout.widget.ConstraintLayout"));

        touchAction.tap(TapOptions.tapOptions().withElement(element(ed))).release().perform();
        touchAction.tap(TapOptions.tapOptions().withElement(element(ll))).release().perform();
        touchAction.tap(TapOptions.tapOptions().withElement(element(cl))).release().perform();
    }
}

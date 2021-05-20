package UIAutomationTesting.ANDROID.Elements;

import UIAutomationTesting.ANDROID.Models.Education;
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

public class EducationScreenElements
{
    public Education education;

    public void getElementsById(AndroidDriver<AndroidElement> driver)
    {
        education = new Education(driver);

        education.qualificationObtained.sendKeys("B Tech Degree IT");
        education.tertiary.sendKeys("TUT");
        education.provinceObtained.sendKeys("Pretoria");
        education.yearObtained.sendKeys("2017");
        education.next.click();
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
        /*driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Qualification Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Tertiary Name Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Province Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter the Qualifications Year Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.Button[@text='Next']").click();*/

    }

    public void getLongPressActions(AndroidDriver<AndroidElement> driver, TouchAction touchAction)
    {
        WebElement qEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Qualification Here']"));
        WebElement tEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Tertiary Name Here']"));
        WebElement pEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Province Here']"));
        WebElement yEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Qualification Year Here']"));
        WebElement buttonsLongPress = driver.findElement(By.xpath("//android.widget.Button[@text='Next']"));

        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(qEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(tEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(pEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(yEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
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

    public void getElementsByClassName(AndroidDriver<AndroidElement> driver,int index)
    {
        driver.findElementsByClassName("android.widget.EditText").get(index).click();
        driver.findElementsByClassName("android.widget.LinearLayout").get(index).click();
        driver.findElementsByClassName("androidx.constraintlayout.widget.ConstraintLayout").get(index).click();
    }
}

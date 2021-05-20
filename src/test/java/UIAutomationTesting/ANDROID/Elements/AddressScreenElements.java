package UIAutomationTesting.ANDROID.Elements;

import UIAutomationTesting.IOS.Models.Address;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class AddressScreenElements
{
    AndroidDriver<AndroidElement> driver;

    Address address;

    public void getElementsById(AndroidDriver<AndroidElement> driver)
    {
        address = new Address(driver);

        address.getAddressLine1().sendKeys("33 Daveyton ");
        address.getAddressLine2().sendKeys("Benoni 1520");
        address.getCity().sendKeys("Benoni");
        address.getPostalCode().sendKeys("1520");
        address.getProvince().sendKeys("Gauteng");
        address.getNext().click();
    }

    public void getElementsByXPath(AndroidDriver<AndroidElement> driver)
    {
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Address Line 1 Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Address Line 2 Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your City Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Province Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Postal Code Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Next']").click();
    }

    public void getElementsByClassName(AndroidDriver<AndroidElement> driver,int index)
    {
        driver.findElementsByClassName("android.widget.EditText").get(index).click();
        driver.findElementsByClassName("android.widget.LinearLayout").get(index).click();
        driver.findElementsByClassName("androidx.constraintlayout.widget.ConstraintLayout").get(index).click();
    }

    public void getLongPressActions(AndroidDriver<AndroidElement> driver, TouchAction touchAction)
    {
        WebElement l1EditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Address Line 1 Here']"));
        WebElement l2EditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Address Line 2 Here']"));
        WebElement cEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your City Here']"));
        WebElement pEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Province Here']"));
        WebElement pcEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Postal Code Here']"));
        WebElement buttonsLongPress = driver.findElement(By.xpath("//android.widget.Button[@text='Next']"));

        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(l1EditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(l2EditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(cEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(pEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(pcEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
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

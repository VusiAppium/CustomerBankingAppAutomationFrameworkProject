package UIAutomationTesting.ANDROID.Elements;

import UIAutomationTesting.ANDROID.Models.Income;
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

public class IncomeDetailsScreenElements
{
    public Income income;

    public void getElementsById(AndroidDriver<AndroidElement> driver)
    {
        income = new Income(driver);

        income.getNetSalary().sendKeys("10000000.00");
        income.getGrossSalary().sendKeys("10000000");
        income.getPaymentDay().sendKeys("20");
        income.getNext().click();
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
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Net Salary Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Gross Salary Here']").sendKeys("hello");
        driver.findElementByXPath("//android.widget.EditText[@text='Enter Your Payment Day Here']").sendKeys("hello");
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
        WebElement nsEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Net Salary Here']"));
        WebElement gsEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Gross Salary Here']"));
        WebElement pdEditButtonLongPress =  driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Your Payment Day Here']"));
        WebElement buttonsLongPress = driver.findElement(By.xpath("//android.widget.Button[@text='Next']"));

        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(nsEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(gsEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(element(pdEditButtonLongPress)).withDuration(Duration.ofSeconds(2))).release().perform();
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

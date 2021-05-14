package UIAutomationTesting.ANDROID.TestCases;

import UIAutomationTesting.ANDROID.DesiredCapabilities.Base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class CustomerBankingAppFourthTestCase extends Base
{
    @Test
    public void customeLogin() throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.androidsample.generalstore:id/namefield")).sendKeys("hello");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//[@text-'Female']")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" +
                "text(\"Argentina\"));");
        driver.findElement(By.xpath("@text='Argentina'")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsdShop")).click();
        driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
        driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(1).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        Thread.sleep(4000);

        int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();

        for(int i =0 ;i<count;i++)
        {
            String amount = driver.findElements(By.id("com.androidsample.genaralstore:id/productPrice")).get(0).getText();

            double amountval = getAmount(amount);
        }

        String amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();

       amount1 = amount1.substring(1);

       double amountValue = Double.parseDouble(amount1);

       String amount2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();

       amount2 = amount2.substring(1);

       double amount2Value = Double.parseDouble(amount2);

       double sumofProducts = amountValue + amount2Value;

       System.out.println(sumofProducts+"Sum of products");






       String total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLb1")).getText();

       total = total.substring(1);

       double totalValue = Double.parseDouble(total);

        Assert.assertEquals(sumofProducts,totalValue);



        WebElement checkbox = driver.findElement(By.className("android.widget.Checkbox"));
        TouchAction  t = new TouchAction(driver);

        t.tap(TapOptions.tapOptions().withElement(element(checkbox))).perform();

        WebElement tc = driver.findElement(By.xpath("//*[@text='Please read our terms and conditions']"));

        t.longPress(LongPressOptions.longPressOptions().withElement(element(tc)).withDuration(Duration.ofSeconds(2000)));

        driver.findElement(By.id("android:id/button1")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();

        Thread.sleep(7000);

        Set<String> contexts = driver.getContextHandles();

        for(String contextName : contexts)
        {
            System.out.println(contextName);
        }

        driver.context("WEBVIEW_com.androidsample.generalstore");

        driver.findElement(By.name("q")).sendKeys("hello");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        driver.pressKey(new KeyEvent(AndroidKey.BACK));


        
    }

    public double getAmount(String value)
    {
        value = value.substring(1);

        double val = Double.parseDouble(value);

        return val;
    }
}

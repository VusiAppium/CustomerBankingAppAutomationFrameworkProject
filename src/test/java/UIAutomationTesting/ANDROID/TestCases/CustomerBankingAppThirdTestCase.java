package UIAutomationTesting.ANDROID.TestCases;

import UIAutomationTesting.ANDROID.DesiredCapabilities.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class CustomerBankingAppThirdTestCase extends Base
{
    @Test
    public void customeLogin() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.androidsample.generalstore:id/namefield")).sendKeys("hello");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//[@text-'Female']")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" +
                "text(\"Argentina\"));");

        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resource)"));

        int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

        for(int i =0;i<count;i++)
        {
            String text = driver.findElement(By.id("com.androidsample:id/productName")).getText();

            if(text == "Jordan 6 Rings")
            {
                driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();

                break;
            }

        }


        //driver.findElement(By.xpath("//*[@text='Argentina']")).click();
        //driver.findElement(By.id("com.androidsample.generalstore:id/btnletsShop")).click();

        String toastMessage = driver.findElement(By.xpath("//android.widget.Text[1]")).getAttribute("name");

        /*System.out.println(toastMessage);

        Assert.assertEquals("Please enter your name",toastMessage);*/
    }
}

package UIAutomationTesting.ANDROID.DesiredCapabilities;

import UIAutomationTesting.ANDROID.DesiredCapabilities.BaseChrome;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Browse extends BaseChrome
{
    @Test
    public void testBrowser() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        /*driver.get("http://facebook.com");
        driver.findElementByXPath("//*[@id='u_0_1']/div/input").sendKeys("qwerty");
        driver.findElementByName("pass").sendKeys("12345");
        driver.findElementByXPath("//button[@value='Log In']");*/
        driver.get("http://cricbuzz.com");
        driver.findElementByXPath("//a[@href='#menu']").click();
        driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();

        System.out.println(driver.getCurrentUrl());

        JavascriptExecutor jse= (JavascriptExecutor) driver;

        jse.executeScript("window.scrollBy(0,400)","");

        //driver.findElement(By.xpath("//h4[@text()='Top Stories']")).getAttribute("class").contains("header");

        Assert.assertFalse(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));

    }
}

package UIAutomationTesting.IOS.Models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Income
{
    public Income(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id="android:id/edtNetSalary")
    public WebElement netSalary;

    @AndroidFindBy(id="android:id/edtGrossSalary")
    public WebElement grossSalary;

    @AndroidFindBy(id="android:id/edtPaymentDay")
    public WebElement paymentDay;

    @AndroidFindBy(id="android:id/btnNext")
    public WebElement next;

    public WebElement getNetSalary()
    {
        return netSalary;
    }

    public WebElement getGrossSalary()
    {
        return grossSalary;
    }

    public WebElement getPaymentDay()
    {
        return paymentDay;
    }

    public WebElement getNext()
    {
        return next;
    }
}

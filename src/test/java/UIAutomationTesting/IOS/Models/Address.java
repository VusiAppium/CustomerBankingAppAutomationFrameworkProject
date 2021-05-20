package UIAutomationTesting.IOS.Models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Address
{
    public Address(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id="android:id/edtAddressLine1")
    public WebElement addressLine1;

    @AndroidFindBy(id="android:id/edtAddressLine2")
    public WebElement addressLine2;

    @AndroidFindBy(id="android:id/edtCity")
    public WebElement city;

    @AndroidFindBy(id="android:id/edtProvince")
    public WebElement province;

    @AndroidFindBy(id="android:id/edtPostalCode")
    public WebElement postalCode;

    @AndroidFindBy(id="android:id/btnNext")
    public WebElement next;

    public WebElement getAddressLine1()
    {
        return addressLine1;
    }

    public WebElement getAddressLine2()
    {
        return addressLine2;
    }

    public WebElement getCity()
    {
        return city;
    }

    public WebElement getProvince()
    {
        return province;
    }

    public WebElement getPostalCode()
    {
        return postalCode;
    }

    public WebElement getNext()
    {
        return next;
    }
}

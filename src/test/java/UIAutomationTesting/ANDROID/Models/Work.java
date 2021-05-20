package UIAutomationTesting.ANDROID.Models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Work
{
    public Work(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id="android:id/edtEmploymentLevel")
    public WebElement employmentLevel;

    @AndroidFindBy(id="android:id/edtPosition")
    public WebElement position;

    @AndroidFindBy(id="android:id/edtCompanyName")
    public WebElement companyName;

    @AndroidFindBy(id="android:id/edtEmploymentStartDate")
    public WebElement startDate;

    @AndroidFindBy(id="android:id/btnNext")
    public WebElement next;

    public WebElement getEmploymentLevel()
    {
        return employmentLevel;
    }

    public WebElement getPosition()
    {
        return position;
    }

    public WebElement getCompanyName()
    {
        return companyName;
    }

    public WebElement getEmploymentStartDate()
    {
        return startDate;
    }

    public WebElement getNext()
    {
        return next;
    }
}

package UIAutomationTesting.IOS.Models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Education
{
    public Education(AndroidDriver<AndroidElement> driver)
    {
          PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id="android:id/edtQualificationObtained")
    public WebElement qualificationObtained;

    @AndroidFindBy(id="android:id/edtTertiary")
    public WebElement tertiary;

    @AndroidFindBy(id="android:id/edtProvinceObtained")
    public WebElement provinceObtained;

    @AndroidFindBy(id="android:id/edtYearObtained")
    public WebElement yearObtained;

    @AndroidFindBy(id="android:id/btnNext")
    public WebElement next;

    public WebElement getQualification()
    {
        return qualificationObtained;
    }

    public WebElement getTertiary()
    {
        return tertiary;
    }

    public WebElement getProvinceObtained()
    {
        return provinceObtained;
    }

    public WebElement getYearObtained()
    {
        return yearObtained;
    }

    public WebElement getNext()
    {
        return next;
    }
}

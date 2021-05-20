package UIAutomationTesting.IOS.Models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Register
{
    public Register(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id="android:id/edtName")
    public WebElement name;

    @AndroidFindBy(id="android:id/edtSurname")
    public WebElement surname;

    @AndroidFindBy(id="android:id/edtEmail")
    public WebElement email;

    @AndroidFindBy(id="android:id/edtIDumber")
    public WebElement idNumber;

    @AndroidFindBy(id="android:id/edtUsername")
    public WebElement username;

    @AndroidFindBy(id="android:id/edtPassword")
    public WebElement password;

    @AndroidFindBy(id="android:id/edtConfirmPassword")
    public WebElement confirmPassword;

    @AndroidFindBy(xpath="android:id/btnSignUp")
    public WebElement signUp;

    public WebElement getName()
    {
        return name;
    }

    public WebElement getSurname()
    {
        return surname;
    }

    public WebElement getEmail()
    {
        return email;
    }

    public WebElement getIdNumber()
    {
        return idNumber;
    }

    public WebElement getUsername()
    {
        return username;
    }

    public WebElement getPassword()
    {
        return password;
    }

    public WebElement getConfirmPassword()
    {
        return confirmPassword;
    }
}

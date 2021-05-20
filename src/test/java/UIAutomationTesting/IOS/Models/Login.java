package UIAutomationTesting.IOS.Models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login
{
    public Login(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id="android:id/edtUsername")
    public WebElement username;

    @AndroidFindBy(id="android:id/edtPassword")
    public WebElement password;

    @AndroidFindBy(xpath="android:id/btnSignIn")
    public WebElement signIn;



    public WebElement getUsername()
    {
        return username;
    }

    public WebElement getPassword()
    {
        return password;
    }
}

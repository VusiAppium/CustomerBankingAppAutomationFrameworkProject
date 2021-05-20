package UIAutomationTesting.ANDROID.Models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Main
{
    public Main(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id="com.example.appiumtwo:id/linearMain")
    public WebElement linearMain;

    @AndroidFindBy(xpath="Login")
    public WebElement loginButton;

    @AndroidFindBy(xpath="Login")
    public WebElement regiterButton;

    public WebElement getLoginButton()
    {
        return loginButton;
    }

    public WebElement getRegiterButton()
    {
        return regiterButton;
    }
}

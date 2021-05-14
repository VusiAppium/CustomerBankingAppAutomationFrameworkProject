package UIAutomationTesting.ANDROID.DesiredCapabilities;

import UIAutomationTesting.ANDROID.DesiredCapabilities.SetupCustomerCapabilitiesAndroid;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;

public class Base
{
    public static AppiumDriverLocalService service;

    public static AppiumDriver<AndroidElement> driver;

    public AppiumDriverLocalService startServer()
    {
       boolean flag = checkIfServerIsRunning(4723);

               if(!flag)
               {
                  service = AppiumDriverLocalService.buildDefaultService();
                  service.start();
               }
       service = AppiumDriverLocalService.buildDefaultService();

       service.start();

       return service;
    }

    public boolean checkIfServerIsRunning(int portNumber)
    {
       boolean isServerRunning = false;

        ServerSocket serverSocket;

        try
        {
            serverSocket = new ServerSocket(portNumber);
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
            isServerRunning = true;
        } finally{
            serverSocket = null;
        }

        return isServerRunning;
    }
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
    {
        AndroidDriver<AndroidElement> driver;

        File appDir = new File("src");
        File app = new File(appDir,"");

        SetupCustomerCapabilitiesAndroid capabilitiesAndroid = new SetupCustomerCapabilitiesAndroid();

        driver = capabilitiesAndroid.setup("","","","","","");

        return driver;
    }

    public AppiumDriverLocalService stop()
    {
        return service;
    }

    public void getScreenshot() throws IOException {
        File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile,new File(""));
    }
}

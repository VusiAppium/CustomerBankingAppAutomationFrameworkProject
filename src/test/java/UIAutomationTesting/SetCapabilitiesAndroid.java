package UIAutomationTesting;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class SetCapabilitiesAndroid
{
    @BeforeClass
    public void setUp() throws MalformedURLException
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("BROWNER_NAME","Android");
        capabilities.setCapability("VERSION","5.1");
        capabilities.setCapability("DEVICE_NAME","emulator-5554");
        capabilities.setCapability("PLATFORM_NAME","Android");

    }

    @AfterClass
    public void teardown()
    {

    }
}

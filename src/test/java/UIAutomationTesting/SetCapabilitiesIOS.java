package UIAutomationTesting;

import com.sun.jdi.connect.spi.TransportService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public class SetCapabilitiesIOS
{

   @BeforeClass
   public void setUp() throws MalformedURLException
   {
      DesiredCapabilities capabilities = new DesiredCapabilities();

      capabilities.setCapability("BROWNER_NAME","IOS");
      capabilities.setCapability("VERSION","11.3");
      capabilities.setCapability("DEVICE_NAME","Simulator");
      capabilities.setCapability("PLATFORM_NAME","iPhone11");

   }

   @AfterClass
   public void teardown()
   {

   }
}

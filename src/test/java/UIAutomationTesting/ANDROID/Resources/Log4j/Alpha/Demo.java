package UIAutomationTesting.ANDROID.Resources.Log4j.Alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Demo
{
    private static Logger log = LogManager.getLogger(Demo.class.getName());

    @Test
    public void getLog()
    {
        log.debug("I am debugging");

        if(5>4)
        {
            log.info("Object is present");
            log.error("Object is not present");
            //log.debug("Object is present");
            log.fatal("this is fatal");
        }
        else
        {
            log.error("Object is not present");
        }
    }
}

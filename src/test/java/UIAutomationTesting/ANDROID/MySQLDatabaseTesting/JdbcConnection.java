package UIAutomationTesting.ANDROID.MySQLDatabaseTesting;

import UIAutomationTesting.ANDROID.DesiredCapabilities.SetupCustomerCapabilitiesAndroid;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.sql.*;

public class JdbcConnection
{
    public static AndroidDriver<AndroidElement> driver;

    public static void main(String[] args) throws SQLException, MalformedURLException {
        String host = "localhost";
        String port = "4723";

        Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port);

        Statement s = conn.createStatement();

        ResultSet rs = s.executeQuery("select * from Customers where CustomerUsername='User1'");


        while(rs.next())
        {
            SetupCustomerCapabilitiesAndroid setupCapabilities = new SetupCustomerCapabilitiesAndroid();

            setupCapabilities.setup("Samsung Galaxy A3","","Android","6.0",
                    "com.example.appiumtwo","LoginActivity");

            driver.findElement(By.xpath("//[@id='CustomerUsername']")).sendKeys(rs.getString(0));
            driver.findElement(By.xpath("//[@id='CustomerPassword']")).sendKeys(rs.getString(1));

        }
        

    }
}

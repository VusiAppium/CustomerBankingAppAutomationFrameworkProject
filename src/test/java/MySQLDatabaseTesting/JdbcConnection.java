package MySQLDatabaseTesting;

import java.sql.*;

public class JdbcConnection
{
    public static void main(String[] args) throws SQLException {
        String host = "localhost";
        String port = "4723";

        Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port);

        Statement s = conn.createStatement();

        ResultSet rs = s.executeQuery("select * from Customers where CustomerUsername='User1'");
        

    }
}

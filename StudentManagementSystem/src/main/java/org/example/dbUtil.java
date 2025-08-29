
package org.example;
import org.postgresql.Driver;

import java.sql.*;

public class dbUtil  {
    public static  final String url= "jdbc:postgresql://localhost:5432/stdmng";
    public static  final String user = "postgres";
    public static final String password = "admin123";
    public static Connection getConnection() throws Exception{
        Connection conn = DriverManager.getConnection (url , user ,password);
        return conn;
    }


}

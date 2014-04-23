// Ing.Javier Riveros
// Source File Name:   DBConnection.java

package com.capanicus.callcenter;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{

    public DBConnection()
    {
    }

    public static Connection openConnection()
    {
        Connection connection = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://xxx.xxx.xxx.xxx:port/callcenter?user=user&password=password");
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return connection;
    }
}

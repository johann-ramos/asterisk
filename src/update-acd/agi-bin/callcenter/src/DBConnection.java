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
            connection = DriverManager.getConnection("jdbc:postgresql://10.1.189.71:9962/snpt02?user=snpt02&password=Cantv#2013");
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return connection;
    }
}

package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String url="jdbc:mysql://localhost:3306/Newbusresv1";
    private static final String userName="root";
    private static final String password="Arun@2002";
    public static Connection getconnection() throws SQLException {
        return DriverManager.getConnection(url,userName,password);
    }
}

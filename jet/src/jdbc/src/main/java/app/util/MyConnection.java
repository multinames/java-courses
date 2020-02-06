package app.util;

import app.exeptions.PreparedException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:./test");
    }



}

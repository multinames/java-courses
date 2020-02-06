package app.util;

import app.exeptions.PreparedException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:./test");
    }

    private  static void createTableGoods() throws PreparedException {
        try (Connection connection = MyConnection.getConnection()) {


        }catch (SQLException ex) {
            throw new PreparedException(ex.getMessage());
        }
    }

}

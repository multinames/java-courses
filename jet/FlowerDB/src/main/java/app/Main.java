package app;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection;
        try {
            Driver driver = new FabricMySQLDriver();
        } catch (SQLException e) {
            System.err.println("Не удалось загрузить класс драйвера");
        }

    }
}

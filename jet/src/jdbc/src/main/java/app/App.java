package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:h2:./test")){

        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

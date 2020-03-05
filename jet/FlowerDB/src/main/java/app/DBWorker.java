package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {

    private final static String URLFIXED =
            "jdbc:mysql://localhost:3306/javat?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
                    "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "javat";
    private static final String PASSWORD = "java123";
    private Connection connection;

    public DBWorker() {
        try {
            connection=
                    DriverManager.getConnection(URLFIXED,USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}

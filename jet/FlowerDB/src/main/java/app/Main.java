package app;

//import com.mysql.fabric.jdbc.FabricMySQLDriver;


import java.sql.*;

public class Main {
    private static final String URL= "jdbc:mysql://localhost:3306/javat";
    private final static String URLFIXED =
            "jdbc:mysql://localhost:3306/javat?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
                    "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "javat";
    private static final String PASSWORD = "java123";


    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection=
            DriverManager.getConnection(URLFIXED,USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

             // statement.execute("INSERT INTO animal(animal_name, animal_des) VALUES('cat1','good_cat1')");
             //statement.execute("select * from animal");
           // int res = statement.executeUpdate("UPDATE animal SET animal_name='NewName' WHERE id=1");
            //ResultSet res = statement.executeQuery("SELECT * from animal");


            // System.out.println(res);

            statement.addBatch("INSERT INTO animal(animal_name, animal_des) VALUES('cat11','good_cat12')");
            statement.addBatch("INSERT INTO animal(animal_name, animal_des) VALUES('cat2','good_cat22')");
            statement.addBatch("INSERT INTO animal(animal_name, animal_des) VALUES('cat3','good_cat23 ')");
            statement.executeBatch();

            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }
            connection.close();

            if (connection.isClosed()) {
                System.out.println("Соединение с БД закрыто");
            }
        } catch (SQLException e) {
            //System.err.println("Что то пошло не так....");
            e.printStackTrace();
        }

    }
}

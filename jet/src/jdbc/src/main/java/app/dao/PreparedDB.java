package app.dao;

// Создание таблиц

import app.exeptions.PreparedException;
import app.util.MyConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedDB {
    public static void prepare () throws PreparedException {
     createTableGoods();
     insertGoods();
    }

    // Создаение таблицы
    private  static void createTableGoods() throws PreparedException {
        String sql = "CREATE TABLE IF NOT EXISTS GOODS (" +
                "ID INT AUTO_INCREMENT," +
                "NAME VARCHAR(255) NOT NULL," +
                "AMOUNT NUMBER(10,2)," +
                "COUNT INT" +
                ")";
        try (
                Connection connection = MyConnection.getConnection();
                Statement statement = connection.createStatement();

        ){

            statement.execute(sql);
        }catch (SQLException ex) {
            throw new PreparedException(ex.getMessage());
        }
    }

    private  static void insertGoods() throws PreparedException {
        String sql = "INSERT INTO GOODS (NAME, AMOUNT, COUNT) VALUES('Beef',230,2);"+
                      "INSERT INTO GOODS (NAME, AMOUNT, COUNT) VALUES('Milk',53,1);" +
                      "INSERT INTO GOODS (NAME, AMOUNT, COUNT) VALUES('Bread',30,3);"
                        ;
        try (
                Connection connection = MyConnection.getConnection();
                Statement statement = connection.createStatement();

        ){

            statement.execute(sql);
        }catch (SQLException ex) {
            throw new PreparedException(ex.getMessage());
        }
    }
}

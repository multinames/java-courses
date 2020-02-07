package app.dao.GoodRepository;

import app.entity.Good;
import app.exeptions.PreparedException;
import app.util.MyConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodRepository {

       public static List<Good> get() throws PreparedException {
        String sql = "SELECT * FROM GOODS";
        try(Connection connection = MyConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Good> goods = new ArrayList<>();
            while (resultSet.next()) {
                Good good = new Good();
                good.setId(resultSet.getInt("ID"));
                good.setName(resultSet.getString("NAME"));
                good.setAmount(resultSet.getDouble("AMOUNT"));
                good.setCount(resultSet.getInt("COUNT"));
                goods.add(good);
            }
            return goods;

        }catch (SQLException ex) {
            throw new PreparedException(ex.getMessage());
        }
    }

    public  static void insert (Good good) throws PreparedException {
        String sql = "INSERT INTO GOODS (NAME, AMOUNT, COUNT) VALUES (?,?,?);";
        try(Connection connection = MyConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, good.getName());
            preparedStatement.setDouble(2, good.getAmount());
            preparedStatement.setInt(3, good.getCount());

            int result = preparedStatement.executeUpdate();
            System.out.println(result);

        }catch (SQLException ex) {
            throw new PreparedException(ex.getMessage());
        }

    }

    public static void delete(int id) throws PreparedException {
        String sql = "DELETE FROM GOODS WHERE id = ?";

        try(Connection connection = MyConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

           int result = preparedStatement.executeUpdate();
            System.out.println(result);

        }catch (SQLException ex) {
            throw new PreparedException(ex.getMessage());
        }

    }

    public static void update(Good good) throws PreparedException {
       String sql = "UPDATE GOODS SET name = '"+good.getName() + "', amount =" +good.getAmount() + ", count =" +good.getCount() + " WHERE id = " +good.getId();

        //String sql = "UPDATE GOODS SET name ='MyName' , amount =1 , count =2 WHERE id = 3";

        try(Connection connection = MyConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            int result = preparedStatement.executeUpdate();
            System.out.println(result);
            System.out.println(sql);

        }catch (SQLException ex) {
            throw new PreparedException(ex.getMessage());
        }

    }

    public static Good get(int id) throws PreparedException {

        String sql = "SELECT * FROM GOODS WHERE id = ?";
        try(Connection connection = MyConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1,id);

            ResultSet rs = preparedStatement.executeQuery();


                Good good = new Good();
                if(rs.next())
                good.setId(rs.getInt(1));
                good.setName(rs.getString(2));
                good.setAmount(rs.getDouble(3));
                good.setCount(rs.getInt(4));
                return good;

        }catch (SQLException ex) {
            throw new PreparedException(ex.getMessage());
        }
        // throw new UnsupportedOperationException();
    }


}

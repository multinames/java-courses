import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class LibraryServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        PrintWriter pw = response.getWriter();
        final String URLFIXED =
                "jdbc:mysql://localhost:3306/javat?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
                        "&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final String USERNAME = "javat";
        final String PASSWORD = "java123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection conn = DriverManager.getConnection(URLFIXED,USERNAME,PASSWORD);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users");

            while (rs.next())
                pw.println(rs.getString("id"));

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
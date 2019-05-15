
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Broker {
    public static void main(String[] args) {
        con();
    }

    static void con () {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "av23@h11");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

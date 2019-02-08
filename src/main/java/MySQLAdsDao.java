import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public abstract class MySQLAdsDao implements Ads {
//    This class should have a private instance property named connection of type Connection that is initialized in the constructor. Define your constructor so that it accepts an instance of your Config class so that it can obtain the database credentials.
    private Connection connection = null;

    public MySQLAdsDao(Config config) throws SQLException {
        Connection connection = DriverManager.getConnection(
            config.getUrl(),
            config.getUser(),
            config.getPassword());
    }

    public static List<Ad> all() throws SQLException {
        List<Ad> ads = new ArrayList<>();
        DriverManager.registerDriver(new Driver());
        Config config = new Config();
        Connection connection = DriverManager.getConnection(
            config.getUrl(), config.getUser(), config.getPassword());
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from ads");
            while (rs.next()){
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")));
             } return ads;
    }



}// END OF EVERYTHING

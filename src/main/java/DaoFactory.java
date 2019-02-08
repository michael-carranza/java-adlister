import java.sql.SQLException;
import java.util.List;


public class DaoFactory {

    // instantiate a new configuration object.
    private static Config config = new Config();

    private static Ads adsDao;

//    public Ads getQuotesDao() throws SQLException {
//        if(adsDao == null) {
//            adsDao = new MySQLAdsDao(config) {
////                public List<Ad> all() throws SQLException {
//                    return super.all();
//                }
//            };
//        }
//        return adsDao;
//    }
}

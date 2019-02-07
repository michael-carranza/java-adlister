import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowAdsServlet", urlPatterns = "/adlist")
public class ShowAdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Use the factory to get the dao object
        Ads AdsDao = DaoFactory.getAdsDao();
        // Use a method on the dao to get all the products
        List<Ad> ads = AdsDao.all();
        // Pass the data to the jsp
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/").forward(request, response);
    }

}
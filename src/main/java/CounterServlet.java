import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    int counter = 0;

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        counter += 1;
        request.setAttribute("theNumber", counter);
            request.getRequestDispatcher("WEB-INF/counter.jsp").forward(request, response);
        }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}


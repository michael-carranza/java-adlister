import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.getWriter().println(
                "    <form action = \"login.jsp\" method = \"POST\">\n" +
                "        User Name: <input type = \"text\" name = \"userName\">\n" +
                "        <br />\n" +
                "        Password: <input type = \"text\" name = \"password\" />\n" +
                "        <input type = \"submit\" value = \"Submit\" />\n" +
                "    </form>"
        );
//request.getRequestDispatcher("/login.jsp").forward(request,response);
    }
}

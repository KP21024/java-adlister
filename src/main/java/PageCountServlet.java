import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PageCountServlet", value = "/count")
public class PageCountServlet extends HttpServlet {

    int count = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String reset = request.getParameter("reset");
        if (reset != null) {
            count = 0;
        }
        count += 1;
        response.getWriter().println(count);
    }


//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


package larry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ScopedVars extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request   , HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("atr1", "Pierwsza warotosc");

        HttpSession session = request.getSession();
        session.setAttribute("atr2", "Druga wartosc session");

        ServletContext application = getServletContext();
        application.setAttribute("atr3", new java.util.Date());

        request.setAttribute("repeated", "Request");
        session.setAttribute("reapeted", "Session");
        application.setAttribute("reapeted", "O. ServletContext");
        RequestDispatcher dispatcher = request.getRequestDispatcher("scoped-vars.jsp");
        dispatcher.forward(request, response);
    }
}

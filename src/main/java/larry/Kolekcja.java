package larry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@WebServlet("/kolekcje")
public class Kolekcja extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] firstNames = {"Bill", "Scott", "Larry"};
        ArrayList lastNames = new ArrayList();
        lastNames.add("Ellison");
        lastNames.add("Gates");
        lastNames.add("Nelly");

        HashMap companyNames = new HashMap();
        companyNames.put("Ellison", "sun");
        companyNames.put("Gates", "Oracle");
        companyNames.put("Nelly", "Microsoft");

        request.setAttribute("first", firstNames);
        request.setAttribute("last", lastNames);
        request.setAttribute("company", companyNames);

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Tytuł strony</title></head><body>");
        out.println(new Date().toString());
        out.println("</body></html>");

        RequestDispatcher dispatcher = request.getRequestDispatcher("kolekcje");
        dispatcher.forward(request, response);

    }
}

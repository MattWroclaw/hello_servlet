package larry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bean-properties")
public class BeanProperties extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        NameBean name = new NameBean("Zosia", "Samosia");
        CompanyBean company = new CompanyBean("Architekta paznokci", "Ostrzenie pazurow");
        EmployeeBean employee = new EmployeeBean(name, company);

        request.setAttribute("employee", employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("bean-properties.jsp");
        dispatcher.forward(request, response);
    }
}

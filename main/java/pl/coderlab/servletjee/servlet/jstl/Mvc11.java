package pl.coderlab.servletjee.servlet.jstl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet(name = "Mvc11", urlPatterns = {"/mvc11"})
public class Mvc11 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String role = req.getParameter("role");
        try {
            final String roleFormatted = "ROLE_" + role.toUpperCase();

            req.setAttribute("userRole", roleFormatted);
        } catch (Exception e){
            e.printStackTrace();
        }
        req.getRequestDispatcher("/jsp1.jsp").forward(req,resp);
    }
}

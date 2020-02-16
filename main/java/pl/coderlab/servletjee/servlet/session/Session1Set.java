package pl.coderlab.servletjee.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet (name = "Session1Set", urlPatterns = {"/session1Set"})
public class Session1Set extends HttpServlet {



/*    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("To jest inicijacacja servletu");
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("counter",0);

        resp.getWriter().println("Ustawimo w sesji counter = 0");

    }

}

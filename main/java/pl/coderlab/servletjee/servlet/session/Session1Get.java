package pl.coderlab.servletjee.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet (name = "Session1Get", urlPatterns = {"/session1Get"})
public class Session1Get extends HttpServlet {



/*    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("To jest inicijacacja servletu");
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Integer counter = (Integer) session.getAttribute("counter");
        if(counter==null){
            resp.getWriter().println("EMPTY");
        }else {
            counter++;
            session.setAttribute("counter", counter);
            resp.getWriter().println("counter = " + counter);
        }

    }

}

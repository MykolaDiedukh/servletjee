package pl.coderlab.servletjee.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;



    @WebServlet(name = "fourth", urlPatterns = {"/fourth"})
    public class Fourth extends HttpServlet {


        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Cookie c = new Cookie("foo", "bar");
            c.setPath("/");
            c.setMaxAge(24*60*60);
            resp.addCookie(c);
            resp.getWriter().println("Dodano ciasteczko");
        }

    }


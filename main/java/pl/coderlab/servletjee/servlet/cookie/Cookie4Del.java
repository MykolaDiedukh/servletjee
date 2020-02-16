package pl.coderlab.servletjee.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "Cookie4Del", urlPatterns = {"/removeCookie"})
public class Cookie4Del extends HttpServlet {



/*    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("To jest inicijacacja servletu");
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nameToDelete = req.getParameter("name");
        Cookie c = new Cookie(nameToDelete, "");
        c.setPath("/");
        c.setMaxAge(0);
        resp.addCookie(c);
        resp.getWriter().println("Usunięto ciasteczko");
    }

}

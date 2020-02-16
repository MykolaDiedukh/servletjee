package pl.coderlab.servletjee.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "cookie3", urlPatterns = {"/cookie3"})
public class Cookie3 extends HttpServlet {



/*    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("To jest inicijacacja servletu");
    }*/

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key = req.getParameter("key");
        String value = req.getParameter("value");
        String time = req.getParameter("time");
        int sekund = Integer.parseInt(time)*60*60;
        Cookie c = new Cookie(key, value);
        c.setPath("/");
        c.setMaxAge(sekund);
        resp.addCookie(c);
        resp.getWriter().println("Dodano: " + key + " : "+ value + " Time: "+ sekund + "sekund");
    }

}

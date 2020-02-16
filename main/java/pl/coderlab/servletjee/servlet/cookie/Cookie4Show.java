package pl.coderlab.servletjee.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "Cookie4Show", urlPatterns = {"/showAllCookies"})
public class Cookie4Show extends HttpServlet {



/*    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("To jest inicijacacja servletu");
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "";
        Cookie[] cookies = req.getCookies();
        if (cookies == null){
            resp.getWriter().println("Nie ustawiono ciasteczek");
            return;
        }
        for(Cookie c : cookies){
                String link = "<div><a href='removeCookie?name=%s'>%s</a></div>";
                String linkText = c.getName() + " : " + c.getValue();
                resp.getWriter().println(String.format(link, c.getName(), linkText));
        }

       // resp.getWriter().println("Wartośc ciasteczka: " + value);
    }

}

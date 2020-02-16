package pl.coderlab.servletjee.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "Cookie51", urlPatterns = {"/cookie51"})
public class Cookie51 extends HttpServlet {



/*    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("To jest inicijacacja servletu");
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {




        Cookie[] cookies = req.getCookies();
        if (cookies == null){
            resp.getWriter().println("Nie ustawiono ciasteczek");
            Cookie cookie = new Cookie("User", "CodersLab");
            cookie.setPath("/");
            cookie.setMaxAge(24*60*60);
            resp.addCookie(cookie);
            resp.getWriter().println("Dodano ciasteczko");
        }else {
            for (Cookie c : cookies) {
                String link = "<div><a href='cookie52?name=%s'>%s</a></div>";
                String linkText = c.getName() + " : " + c.getValue();
                resp.getWriter().println(String.format(link, c.getName(), linkText));
            }
        }

       // resp.getWriter().println("Wartośc ciasteczka: " + value);
    }

}

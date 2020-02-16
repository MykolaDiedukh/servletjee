package pl.coderlab.servletjee.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "showCookie", urlPatterns = {"/showCookie"})
public class Cookie1Get extends HttpServlet {



/*    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("To jest inicijacacja servletu");
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = "";
        Cookie[] cookies = req.getCookies();
        if (cookies == null){
            resp.getWriter().println("Nie ustawiono ciasteczek");
            return;
        }
        for(Cookie c : cookies){
            if("User".equals((c.getName()))){
                value = c.getValue();
                resp.getWriter().println("Wartośc ciasteczka: " + value);
            }
        }


    }

}

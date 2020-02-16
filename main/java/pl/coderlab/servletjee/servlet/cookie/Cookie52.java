package pl.coderlab.servletjee.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet (name = "Cookie52", urlPatterns = {"/cookie52"})
public class Cookie52 extends HttpServlet {



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
            String message = "Nie odwiedziles jeszcze tej strony";
            resp.getWriter().println(message);
            resp.sendRedirect("cookie51?msg=" + URLEncoder.encode(message, "UTF-8"));
        }else  {
            String nameToDelete = req.getParameter("name");
            Cookie c = new Cookie(nameToDelete, "");
            c.setPath("/");
            c.setMaxAge(0);
            resp.addCookie(c);
            resp.getWriter().println("Usunięto ciasteczko");
        }

       // resp.getWriter().println("Wartośc ciasteczka: " + value);
    }

}

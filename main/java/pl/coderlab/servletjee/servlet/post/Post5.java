package pl.coderlab.servletjee.servlet.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Post5", urlPatterns = {"/post5"})
public class Post5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String degrees = request.getParameter("degrees");
        String b = request.getParameter("b");
        String c = request.getParameter("c");

        int aNum = Integer.parseInt(b);
        int bNum = Integer.parseInt(b);
        int cNum = Integer.parseInt(c);

       // double delta = a% 2 + b + c;
        double delta =0.0;
        if ((bNum*bNum - (4 * aNum * cNum)) < 0) {
            response.getWriter().println("Delta jest mnejsza od zera");
        } else {
            delta = (-bNum + Math.sqrt((bNum*bNum - 4 * aNum * cNum))) / 2 * aNum;
            response.getWriter().println(delta);
        }
    }

}

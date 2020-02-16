package pl.coderlab.servletjee.servlet.post;

import pl.coderlab.servletjee.servlet.utils.Censor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Post4", urlPatterns = {"/post4"})
public class Post4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        String c = request.getParameter("c");

        int aNum = Integer.parseInt(a);
        int bNum = Integer.parseInt(b);
        int cNum = Integer.parseInt(c);

       // double delta = a% 2 + b + c;
        double delta =bNum*bNum - (4 * aNum * cNum);
        if (delta < 0) {
            response.getWriter().println("Delta jest mnejsza od zera");
        } else if (delta==0) {

            double x1 = (-bNum  / 2 * aNum);
            response.getWriter().println(x1);
        }
        else if (delta > 0){
            double x1 = (-bNum + Math.sqrt(delta))/2*aNum;
            double x2 = (-bNum - Math.sqrt(delta))/2*aNum;

            response.getWriter().println("x1 = " + x1);
            response.getWriter().println("x2 = " + x2);
        }
    }

}

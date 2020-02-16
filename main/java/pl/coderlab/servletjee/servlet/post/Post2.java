package pl.coderlab.servletjee.servlet.post;

import pl.coderlab.servletjee.servlet.utils.Censor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Post2", urlPatterns = {"/post2"})
public class Post2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String freeSpeech = request.getParameter("freeSpeech");
        boolean acknowlege = request.getParameter("acknowlege") !=null;
        String output = freeSpeech;
        if (acknowlege != true){
            output = Censor.doCensor(freeSpeech);
        }
        response.getWriter().println(output);

    }

}

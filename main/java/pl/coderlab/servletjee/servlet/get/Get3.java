package pl.coderlab.servletjee.servlet.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet (name = "Get3", urlPatterns = {"/get3"})
public class Get3 extends HttpServlet {



/*    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("To jest inicijacacja servletu");
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,String[]> parametes = req.getParameterMap();
        for (String key : parametes.keySet()){
            resp.getWriter().println(key + ": "+ Arrays.toString(parametes.get(key)));
        }
    }

}

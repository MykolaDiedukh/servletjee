package pl.coderlab.servletjee.servlet.get;


import pl.coderlab.servletjee.servlet.utils.Numeric;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "getForm3", urlPatterns = {"/getForm3"})
public class getForm3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numbers = request.getParameter("page");
        String div = "";
        int sum = 0;
        if(numbers!=null){
            int num = Integer.parseInt(numbers);
            if(num>0){
                for (int i = 1; i<=Integer.parseInt(numbers); i++){
                    if(num%i==0){
                        div = div + i + " ";
                    }
                }
            }
        }

        if(numbers!=null){
            char[] charactersArray = numbers.toCharArray();
            for(int i = 0; i <= charactersArray.length-1; i++){
                if(Numeric.isNumeric(charactersArray[i])){
                    sum = sum + Integer.parseInt(String.valueOf(charactersArray[i]));
                }
            }
        }



        response.getWriter().println(sum);
        response.getWriter().println(div);

    }

}

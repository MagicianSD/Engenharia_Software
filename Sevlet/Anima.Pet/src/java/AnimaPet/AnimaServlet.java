
package AnimaPet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Eduardo Silva
 */

@WebServlet(name = "AnimaServlet", urlPatterns = {"/api"})
public class AnimaServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             String name = request.getParameter("userName");
             String matricula = request.getParameter("userMatricula");
             out.println("<h1>Anima Pet</h1>");
             out.println("<td>"
                     + "<tr>Nome</tr>"+"->" + name + "<br>"
                     + "<tr>Matrícula</tr>"+"->" + matricula
                     + "</td>");
             out.close();


        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

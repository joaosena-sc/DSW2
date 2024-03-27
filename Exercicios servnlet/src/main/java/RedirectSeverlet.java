

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectSeverlet
 */
public class RedirectSeverlet extends HttpServlet {
	  
	    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	response.sendRedirect("http://localhost:8080/Exercicio_servelet_1/Form.jsp");
	    }
}

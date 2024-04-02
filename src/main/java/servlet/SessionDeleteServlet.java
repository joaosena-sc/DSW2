package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ServiceManager;

/**
 * Servlet implementation class SessionDeleteServlet
 */
@WebServlet("/deleteSession")
public class SessionDeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {	
		
		int idSession =  Integer.parseInt(request.getParameter("idServiceForSession"));
		ServiceManager.deleteService(idSession);
		
		response.sendRedirect("SessionListServlet");
	}
}

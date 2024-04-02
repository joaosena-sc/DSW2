package servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Service;
import model.ServiceManager;

/**
 * Servlet implementation class ServiceDeleteServlet
 */
@WebServlet("/deleteService")
public class ServiceDeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {	
		
		int idService =  Integer.parseInt(request.getParameter("id"));
		ServiceManager.deleteService(idService);
		
		response.sendRedirect("ServiceListServlet");
	}
}

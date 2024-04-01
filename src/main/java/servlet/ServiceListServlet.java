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
 * Servlet implementation class ServiceListServlet
 */
@WebServlet("/ServiceListServlet")
public class ServiceListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		//Set Services 	
		Service service = new Service("Limpeza de pele","Remove cravos e espinhas",120);
		Service service1 = new Service("Bronzeamento","Bronzeamento artificial",150);
		ServiceManager.addService(service);
		ServiceManager.addService(service1);
				
		List<Service> services =  ServiceManager.getServices();
		
		request.setAttribute("services", services);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Index.jsp");
		
		dispatcher.forward(request, response);
	}
}

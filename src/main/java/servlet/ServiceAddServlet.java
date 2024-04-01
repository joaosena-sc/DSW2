package servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class ServiceAddServlet
 */
@WebServlet("/addService")
public class ServiceAddServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
			
		//Get Parameter
			String serviceName = request.getParameter("name");
			String serviceDescription = request.getParameter("description");
			float servicePrice =  Float.parseFloat(request.getParameter("price"));
			
			if((serviceName.isEmpty() || serviceDescription.isEmpty() || servicePrice<=0)) {
				PrintWriter out = 
						
						out.toString("<html>Erro! Preencha");
			}
			else {
				//New Service
				Service service = new Service(serviceName,serviceDescription,servicePrice);			
				ServiceManager.addService(service);
					
				List<Service> services =  ServiceManager.getServices();
					
				request.setAttribute("services", services);
				RequestDispatcher dispatcher = request.getRequestDispatcher("Index.jsp");
					
				dispatcher.forward(request, response);		
			}		
	}
}

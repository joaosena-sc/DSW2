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
import model.Session;
import model.SessionManager;

/**
 * Servlet implementation class SessionListServlet
 */
public class SessionListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {	
				
		List<Session> sessions =  SessionManager.getSessions();
		
		request.setAttribute("sessions", sessions);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Index.jsp");
		
		dispatcher.forward(request, response);
	}
}

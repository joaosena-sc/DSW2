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
import jakarta.servlet.http.HttpSession;
import model.Service;
import model.ServiceManager;
import model.Session;
import model.SessionManager;

/**
 * Servlet implementation class SessionAddServlet
 */
@WebServlet("/addSession")
public class SessionAddServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//Get Parameter
		int idService = Integer.parseInt(request.getParameter("idServiceForSession"));
		long sessionDate = session.getCreationTime();
		
		Session newSession = new Session(idService,sessionDate);
		SessionManager.addSession(newSession);
		
		response.sendRedirect("SessionListServlet");
	}
}

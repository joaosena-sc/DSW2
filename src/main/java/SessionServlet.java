import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        // Retrieve the session attribute "contSession"
        Integer sessionCount = (Integer) session.getAttribute("contSession");
        
        if (sessionCount != null) {
            // Increment the session count if the attribute is already set
            sessionCount++;
        } else {
            // Initialize the session count if it's not set yet
            sessionCount = 1;
        }
        
        // Set the updated session count back to the session attribute
        session.setAttribute("contSession", sessionCount);
        request.setAttribute("contSession", sessionCount);
        request.getRequestDispatcher("Session.jsp").forward(request, response);
    }
}

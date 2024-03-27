import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FormSeverlet")
public class FormSeverlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        String nomeForm = request.getParameter("nome");
        String cpfForm = request.getParameter("cpf");
        
        PrintWriter out = response.getWriter();
        
        if((nomeForm!=null&&!nomeForm.isEmpty())&&(cpfForm!=null&&!cpfForm.isEmpty())){
        	out.write("<html>");
            out.write("<body>");
            out.write("<p>Nome: " + nomeForm + "</p>");
            out.write("<p>CPF: " + cpfForm + "</p>");
            out.write("</body>");
            out.write("</html>");
            out.close();
        }
        else {
        	out.write("Erro! Preencha os campos nome e cpf.");
        }
        
        
    }
}

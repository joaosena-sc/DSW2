import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/QuerySeverlet")
public class QuerySeverlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeParam = request.getParameter("nome");
        String idadeParam = request.getParameter("idade");

        if ((nomeParam != null && !nomeParam.isEmpty()) && (idadeParam!=null&&!idadeParam.isEmpty())) {
            PrintWriter out = response.getWriter();
            out.write("<html>");
            out.write("<body>");
            out.write("<p1>Nome:" + nomeParam+"<p1>");
            out.write("<p></p>");
            out.write("<p1>Idade:" + idadeParam+"<p1>");
            out.write("</body>");
            out.close();
        } else {
            response.getWriter().write("Erro! Nome e/ou Idade não fornecido na URL.");
            response.getWriter().write(" Utilize '?nome=<valor>&idade=<valor2>' para informar os valores");
        }
    }
}

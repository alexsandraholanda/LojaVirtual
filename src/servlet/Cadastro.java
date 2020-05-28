package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Cadastro() {
        super();
    }


     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         PrintWriter out = response.getWriter();
    
         String nome = request.getParameter("nome");
         String endereco = request.getParameter("endereco");
         String email = request.getParameter("email");
         String dataEmTexto = request.getParameter("dataNascimento");
    
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDate data = LocalDate.parse(dataEmTexto, formato);
    
         out.println("<html>");
         out.println("<body>"); 
         out.println("Cadastro de " + nome + "</br>Nascido em  " + formato.format(data) + "</br>Endereço: " + endereco + 
         "</br>Email: " + email + "</br> </br> Cadastro realizado com sucesso!!! ");   	 
         out.println("</body>");
         out.println("</html>");
     }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

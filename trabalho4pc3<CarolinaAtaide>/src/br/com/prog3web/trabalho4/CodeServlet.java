package br.com.prog3web.trabalho4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Preferencia")
public class CodeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String nome;
		String matricula;
		Integer idade;
		String sexo;
		//String frutas[];
		// pegando os valores de variáveis enviadas do cliente
		nome = req.getParameter("nome");
		matricula = req.getParameter("matricula");
		idade = Integer.parseInt(req.getParameter("idade"));
		sexo = req.getParameter("sexo");
		//frutas = req.getParameterValues("fruta");
		// imprime estes dados no cliente
		out.println("<HTML><HEAD><TITLE>Resultados");
		out.println("</TITLE></HEAD><BODY>");
		out.println("<H1>Servlet com dados do form</H1>");
		out.println("<BR><b>Bom dia " + nome + "!</p> <br>");
		out.println("<BR><b>Matricula: " + matricula + "!</p> <br>");
		out.println("<BR><b>Idade: " + idade + "!</p> <br>");
		out.println("<BR><b>Sexo: " + sexo + "!</p> <br>");


		
		if (sexo.equals("masculino") && idade>=18)
			out.println("<BR>Você precisará servir ao exército ! ");
		else if(sexo.equals("masculino") && idade<18) {
			out.println("Você está ok com as obrigações militares!");
		}
		else {
			out.println("Você não precisa servir ao exército!");
		}
		out.println("<BR></BODY></HTML>");
		out.close();
	}
}

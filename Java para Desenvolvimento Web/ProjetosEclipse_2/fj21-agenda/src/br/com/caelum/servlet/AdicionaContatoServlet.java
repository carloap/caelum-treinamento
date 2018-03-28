package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.text.ParseException; // HERP DERP!

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class AdicionaContatoServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// pego a conexão que viajou pela request...
		Connection c = (Connection) req.getAttribute("conexao"); // e atribuo para uma variavel do tipo Connection
		
		
		// busca writer
		PrintWriter out = resp.getWriter(); // deixa a saida preparada...
		
		// buscando os parâmetros
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");
		String dataEmTexto = req.getParameter("dtNasc");
		Calendar dataNascimento = null;
		
		// fazendo conversão da data
		try {
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto); // o certo mesmo seria -> dd/MM/yyyy	
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(data);
		} catch (ParseException e) {
			out.println("Erro de conversão da data");
			return; // para a execução do método
		}
		
		// monta um objeto contato
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(dataNascimento);
		
		// salva o contato
		ContatoDao dao = new ContatoDao(c);
		dao.adiciona(contato);
		
		// imprime mensagem que foi adicionado
		/*
		out.println("<html>");
		out.println("<body>");
		out.println("Contato " + contato.getNome() + " adicionado com sucesso");
		out.println("</body>");
		out.println("</html>");
		*/
		
		// redireciona para o novo jsp
		RequestDispatcher rd = req.getRequestDispatcher("/contato-adicionado.jsp");
		rd.forward(req, resp); // request, response
		
	}
}

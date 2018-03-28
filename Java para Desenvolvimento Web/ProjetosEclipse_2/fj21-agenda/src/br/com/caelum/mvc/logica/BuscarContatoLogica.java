package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class BuscarContatoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp)
			throws Exception {

		// pego a conexão que viajou do doFilter até aqui
				Connection c = (Connection)req.getAttribute("conexao"); // e atribuo para uma variavel do tipo Connection
				
				
		// buscando os parâmetros
		long id = Long.parseLong(req.getParameter("id"));

		// monta um objeto contato
		Contato contato = new Contato();
		contato.setId(id);

		// buscando o contato
		ContatoDao dao = new ContatoDao(c);
		Contato encontrado = dao.busca(contato);

		// passa contato pra uma nova variavel
		req.setAttribute("encontrado", encontrado);
		
		return "altera-contato.jsp";
	}

}

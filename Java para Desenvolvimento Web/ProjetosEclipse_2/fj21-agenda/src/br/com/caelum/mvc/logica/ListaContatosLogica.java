package br.com.caelum.mvc.logica;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class ListaContatosLogica implements Logica {
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		// pego a conexão que viajou do doFilter até aqui
		Connection c = (Connection)req.getAttribute("conexao"); // e atribuo para uma variavel do tipo Connection
		
		
		List<Contato> contatos = new ContatoDao(c).getLista();
		
		req.setAttribute("contatos", contatos);
		
		return "lista-contatos.jsp";
	}
}

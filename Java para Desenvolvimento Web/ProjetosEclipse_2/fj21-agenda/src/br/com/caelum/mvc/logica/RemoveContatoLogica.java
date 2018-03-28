package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class RemoveContatoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		
		// pegar a conexão da request e usa-la
		Connection c = (Connection)req.getAttribute("conexao"); // tem que fazer cast pois o atributo é do tipo HttpServletRequest
		
		long id = Long.parseLong(req.getParameter("id"));
		
		Contato contato = new Contato();
		contato.setId(id);
		
		ContatoDao dao = new ContatoDao(c);
		dao.exclui(contato);
		
		System.out.println("Excluindo contato...");
		
		return "mvc?logica=ListaContatosLogica";
	}
	
}

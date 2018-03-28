package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.modelo.Contato;

public class AlteraContatoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		long id = Long.parseLong(req.getParameter("id")); // id para alterar
		
		Contato contato = new Contato();
		contato.setId(id);
		
		
		return null;
	}

}

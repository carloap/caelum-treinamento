package br.com.caelum.servlet;

import java.sql.Connection;
import java.util.List;

import br.com.caelum.agenda.dao.*;
import br.com.caelum.agenda.modelo.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContatoServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) {
		// pego a conexão que viajou do doFilter até aqui
		Connection c = (Connection)request.getAttribute("conexao"); // e atribuo para uma variavel do tipo Connection
				
		
		List<Contato> contatos = new ContatoDao(c).getLista();
		request.setAttribute("contatos", contatos);
		// nada de mais, não serve pra nada
	}
}

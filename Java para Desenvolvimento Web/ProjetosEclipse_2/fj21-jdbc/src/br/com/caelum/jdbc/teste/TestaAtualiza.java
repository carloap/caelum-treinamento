package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAtualiza {
	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setId(1);
		contato.setNome("Carlitos");
		contato.setEmail("carlitos@caelum.com.br");
		contato.setEndereco("R. Vergueirox, 3185 cj 57");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.altera(contato);
		
		System.out.println("Atualizado com sucesso!");
	}
}

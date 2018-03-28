package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {
	public static void main(String[] args) {
		//  pronto para gravar
		// aqui nós definimos os valores dos campos
		Contato contato = new Contato();
		
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro, 3185 cj 57");
		contato.setDataNascimento(Calendar.getInstance());
		
		// grave nessa conexão!
		// aqui abrimos uma conexão no construtor (no momento que instancia)
		ContatoDao dao = new ContatoDao();
		
		// método elegante
		// chama o metodo adiciona, passando os dados do contato
		dao.adiciona(contato);
		
		System.out.println("Registro gravado!");
		
	}
}

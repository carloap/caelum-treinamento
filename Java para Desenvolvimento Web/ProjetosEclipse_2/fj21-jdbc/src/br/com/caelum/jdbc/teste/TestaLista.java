package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {
	public static void main(String[] args) {
		// faz conexão
		ContatoDao dao = new ContatoDao();
		
		// liste os contatos com o DAO
		List<Contato> contatos = dao.getLista();
		
		// iterar na lista e imprimir informações
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("E-mail: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
		}
	}
}

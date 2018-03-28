package br.com.caelum.argentum.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {
	private String mensagem = "Quem é você?";
	
	public String getMensagem() {
		System.out.println("\n-exibe a mensagem 'quem é você'.");
		return mensagem;
	}
	
	public String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		System.out.println("\n-mostra o nome digitado.");
		return nome;
	}
	
	public void nomeFoiDigitado() {
		System.out.println("\nChamou o botão.");
	}
		
	
}

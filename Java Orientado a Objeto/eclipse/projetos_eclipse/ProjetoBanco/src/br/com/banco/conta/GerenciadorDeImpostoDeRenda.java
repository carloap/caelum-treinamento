package br.com.banco.conta;
public class GerenciadorDeImpostoDeRenda {
	private double total;

	public void adiciona(Tributavel t) {
		System.out.println("Adicionado tributavel: " + t);
		this.total += t.calculaTributos();
	}
	
	public double getTotal() {
		return this.total;
	}

}

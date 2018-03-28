package br.com.banco;
import br.com.banco.conta.ContaCorrente;
import br.com.banco.conta.GerenciadorDeImpostoDeRenda;
import br.com.banco.conta.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda ger = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		ger.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		ger.adiciona(cc);
		
		System.out.println("Total do Imposto de Renda: " + ger.getTotal());
	}
}

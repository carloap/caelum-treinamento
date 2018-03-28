package br.com.banco;
import br.com.banco.conta.ContaCorrente;
import br.com.banco.conta.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(200);
		System.out.println("Calcular Tributo C.Corrente: " + cc.calculaTributos());
		
		// testando polimorfismo
		Tributavel t = cc;
		System.out.println("Calcular Tributo C.Corrente: "
				+ t.calculaTributos() + " (polimorfismo) ");

		
	}
}

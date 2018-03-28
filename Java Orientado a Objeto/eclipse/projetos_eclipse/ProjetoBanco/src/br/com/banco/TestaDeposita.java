package br.com.banco;
import br.com.banco.conta.Conta;
import br.com.banco.conta.ContaPoupanca;
import br.com.banco.conta.ValorInvalidoException;


public class TestaDeposita {
	// Testar exceções
	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		try{
			cp.deposita(-100); // isso vai retornar uma exceção
		} catch (ValorInvalidoException ex) {
			System.out.println(ex.getMessage()); // mostra a mensagem definida na exceção lá atrás...
		}
		
		
	}
}

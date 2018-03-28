package br.com.banco.conta;
public class ValorInvalidoException extends RuntimeException {
	// Exception -> checked, é necessário identificar as exceções
	// RuntimeException -> unchecked, não é necessário identificar as exceções
	
	public ValorInvalidoException(double valor) {
		super("Você tentou depositar um valor negativo: " + valor);
		
	}
}

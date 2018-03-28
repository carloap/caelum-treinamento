package br.com.banco;

import br.com.banco.conta.*;

public class TestaTipoConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		System.out.println(conta);
		// imprime o endereço de memória estranho do objeto
		// usando o método toString(), passa a imprimir a mensagem retornada
	}
}

package br.com.banco;

import br.com.banco.conta.Conta;
import br.com.banco.conta.ContaCorrente;

public class TestaComparacaoConta {
	public static void main(String[] args) {
		Conta a = new ContaCorrente();
		Conta b = new ContaCorrente();
		
		a.setNumero(1234);
		b.setNumero(1234);
		
		if (a == b) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		
		if (a.equals(b)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
	}
}

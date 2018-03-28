package br.com.banco;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.banco.conta.*;

public class TestaOrdenacao {
	public static void main(String[] args) {
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		
		ContaPoupanca p1 = new ContaPoupanca();
		p1.setNumero(1987);
		p1.setNomeCliente("Robson");
		contas.add(p1);
		
		ContaPoupanca p2 = new ContaPoupanca();
		p2.setNumero(1462);
		p2.setNomeCliente("Denise");
		contas.add(p2);
		
		ContaPoupanca p3 = new ContaPoupanca();
		p3.setNumero(1854);
		p3.setNomeCliente("Pamela");
		contas.add(p3);
		
		Collections.sort(contas);
		
		for (int i = 0; i < contas.size(); i++) {
			Conta atual = contas.get(i);
			System.out.println("numero: " + atual.getNumero());
		}
		
		// o ToString da classe Conta sobreescreve o do LinkedList/ArrayList
		System.out.println(contas);
		
		
		
	}
}

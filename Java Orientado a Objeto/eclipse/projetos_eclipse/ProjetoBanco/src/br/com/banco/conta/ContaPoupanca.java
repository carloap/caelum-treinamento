package br.com.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	@Override 
	public void atualiza(double taxa) {
		// super.atualiza(taxa);
		double saldo = this.getSaldo();
		saldo += taxa * 3;
		this.deposita(saldo);
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		// compara o número da conta
		
		if(this.getNumero() > o.getNumero() ){
			return 1;
		}
		if(this.getNumero() < o.getNumero()) {
			return -1;
		}
		return 0;
		
		// como comparar strings em ordem alfabética??
		
	}

	
	
}

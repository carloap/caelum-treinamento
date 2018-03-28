package br.com.banco.conta;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void atualiza(double taxa) {
		double saldo = this.getSaldo();
		saldo += taxa;
		this.deposita(saldo);	
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	


}

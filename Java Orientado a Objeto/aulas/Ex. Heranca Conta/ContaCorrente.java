public class ContaCorrente extends Conta {
	// herda as mesmas características de Conta
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2; // faz a mesma coisa do atualiza de Conta, só que em DOBRO
	}

	// subtrai 10 centavos de cada depósito
	public void deposita(double valor) {
		this.saldo += (valor-0.10);
	}

	
}

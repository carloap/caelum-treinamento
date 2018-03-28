public class ContaPoupanca extends Conta {
	// herda as mesmas características de Conta
	
	public void atualiza() {
		this.saldo += this.saldo * taxa * 3; // faz a mesma coisa do atualiza de Conta, só que no TRIPLO
	}

	public void deposita() {
		this.saldo += valor -0.10;
	}
}

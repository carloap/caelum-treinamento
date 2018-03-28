public class Conta { // classe conta
	// atributos
	protected double saldo;
	
	// construtor (opcional)
	public Conta() {
		// não faz nada
	} 

	// getters e setters
	public double getSaldo() {
		return this.saldo;
	}

	// métodos	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	// atualiza valor do saldo de acordo com taxa percentual
	public void atualiza(double taxa) { // aque pode ser acessado com super, se o atributo "saldo" estiver em private
		this.saldo += this.saldo * taxa;
	}
	

}

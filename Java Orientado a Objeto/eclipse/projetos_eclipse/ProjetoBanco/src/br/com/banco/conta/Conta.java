package br.com.banco.conta;

/**
 * @author Carlos
 * @since 1.0
 */
public abstract class Conta {
	
	private String nomeCliente;

	private int numero;
	
	private double saldo; // como resolver o problema IEEE 754 sem usar double????

	// getters e setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public double getSaldo() {
		return saldo;
	}

	
	/**
	 * Depositar um valor
	 * @param d
	 */
	public void deposita(double d) {
		if (d < 0) {
			throw new ValorInvalidoException(d);
		} else {
			this.saldo += d - 0.10; // taxa de deposito
		}
	}

	public abstract void atualiza(double taxa);

	// retorno string do objeto -> quando imprimir um Syso da classe Conta
	public String toString() {
		return "esse objeto é uma conta com saldo R$ " + this.saldo;
	}
	
	// atalho equ Ctrl + espaço
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj; // realizando um cast que força o objeto ser do tipo Conta
		return this.numero == outraConta.numero;
	}

	
	
	
}

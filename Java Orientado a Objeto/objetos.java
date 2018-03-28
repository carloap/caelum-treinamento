class Funcionario {
	// atributos	
	String nome;
	int departamento;
	double salario;
	String dtEntrada;
	String RG;

	// métodos
	public void recebeAumento(double percAumento) {
		this.salario = this.salario * (percAumento+1); 
		// +10% é o mesmo que multiplicar por 1.1, para preservar o valor e adicionar 10%
	}

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}

	

}

class Principal {
	public static void main(String[] args) {
		// executa as rotinas
	}
}


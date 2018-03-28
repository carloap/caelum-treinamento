public class Acumulador {
	
	// classe de acumulador (polimorfismo)
	/* será executado o método calculaBonus() do funcionário que for chamado aqui, 
	 * levando em consideração que já foi instanciado antes, será chamado o método dinamicamente!
	 */
	double acumulador;
	
	void acumula(Funcionario f) {
		this.acumulador += f.calculaBonus();
	}
}

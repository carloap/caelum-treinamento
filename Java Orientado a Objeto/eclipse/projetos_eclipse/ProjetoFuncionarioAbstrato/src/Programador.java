public class Programador extends Funcionario {

	@Override
	double calculaBonus() {
		return this.salario * 0.12;
	}
	
}

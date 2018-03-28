public class Diretor extends Funcionario {
	
	@Override
	double calculaBonus() {
		return this.salario * 0.5;
	}
	
}

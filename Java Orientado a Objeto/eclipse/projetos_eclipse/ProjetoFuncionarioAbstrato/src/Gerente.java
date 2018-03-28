public class Gerente extends Funcionario{
	
	@Override
	double calculaBonus() {
		return this.salario * 0.1;
	}
	
}

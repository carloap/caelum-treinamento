public abstract class Funcionario {
	String nome;
	String RG;
	double salario;
	String departamento;
	
	/* bonus padrão do Funcionario 
	double calculaBonus(){
		return this.salario*0.1;
	}
	*/
	
	
	/* Derrepente o Funcionario não pode ter mais bonus, deixamos como visibilidade "abstract" */
	
	abstract double calculaBonus(); // quando tem pelo menos 1 metodo abstrato, toda a classe deve ser abstrata!
	
}

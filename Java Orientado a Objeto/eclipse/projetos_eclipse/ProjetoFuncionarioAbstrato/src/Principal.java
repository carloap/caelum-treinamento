/* classe principal */
public class Principal {
	public static void main(String[] args) {
		
		
		// Funcionario f = new Funcionario(); // uma classe que é ABSTRATA não deve ser instanciada!
		Funcionario g = new Gerente();
		
		g.calculaBonus();
		
		// Funcionario g = new Gerente();
		/* Nesse caso, a classe Gerente(instância) está com aparência(tipo) de Funcionário, 
		 * e só pode enxergar os métodos da classe Gerente, se eles forem sobreescritos.
		 * */
		
		Funcionario p = new Programador();
		p.calculaBonus();
		
		// -------------------
		Acumulador ac = new Acumulador();
		ac.acumula(p); // não funciona, o funcionário não pode ser mais instanciado!
		// f.calculaBonus; // não é mais um método, agora é abstrato!
		
	}
	
}

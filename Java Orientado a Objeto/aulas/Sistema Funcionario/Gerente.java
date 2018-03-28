public class Gerente extends Funcionario { // gerente é um funcionario
	double Bonifica() {
		return super.Bonifica() * 2; 
		/* "super" server para referenciar atributo ou método da classe herdada. É util para diferenciar metodos ou atributos semelhantes de classes distintas.
		*/
	}
}

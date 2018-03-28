class Empresa {
	String nome;
	int cnpj;
	// array de funcionarios (com as mesmas características da classe "classeFuncionario") sem tamanho definido
	classeFuncionario[] empregados;
	int posicao = 0;

	public void admite(classeFuncionario f) {
		if(empregados[posicao] != null){
			this.posicao++; // verifica se a posição atual está preechida, e incrementa		
			this.admite(f); // recursividade
		}
		empregados[posicao] = f;
	}

	public void mostraEmpregados() {
		int total = empregados.length; // pega o tamanho da array
		for(int i = 0; i<total; i++){
			System.out.println("Funcionario na posição[" + i + "]: ");
			System.out.println(" - Nome: "+ empregados[i].getNome());
			System.out.println(" - Salário: "+ empregados[i].getSalario());
		}


		/*
		for(String n : nomes) {
			System.out.println(n);
		}
		*/	
	}

	
}

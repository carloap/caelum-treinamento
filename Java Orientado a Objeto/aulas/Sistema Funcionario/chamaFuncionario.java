class chamaFuncionario {
	public static void main(String[] args) {

		classeFuncionario f1 = new classeFuncionario("Carlos");

		//f1.setNome("Carlos");
		f1.setDepartamento("TI");
		f1.setSalario(3200.92);
		
		System.out.println("*========================*");
		System.out.println("ID: " + f1.getId());
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Salario atual: " + f1.getSalario());
		f1.recebeAumento(50); // adiciona ao salario base
		System.out.println("Salario com aumento: " + f1.getSalario());
		System.out.println("Ganho anual: " + f1.getGanhoAnual());
		


		classeFuncionario f2 = new classeFuncionario("Henrry");
		//f1.setNome("Henrry");
		f2.setDepartamento("ADM");
		f2.setSalario(2800.50);
		System.out.println(" ");
		System.out.println("ID: " + f2.getId());
		System.out.println("Nome: " + f2.getNome());
		System.out.println("Salario atual: " + f2.getSalario());
		f2.recebeAumento(150); // adiciona ao salario base
		System.out.println("Salario com aumento: " + f2.getSalario());
		System.out.println("Ganho anual: " + f2.getGanhoAnual());
		System.out.println("*========================*");

	}

}

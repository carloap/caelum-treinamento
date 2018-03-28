class chamaEmpresa {
	public static void main(String[] args) {
		// cria a empresa
		Empresa emp = new Empresa();
		emp.empregados = new classeFuncionario[10];

		// cria os funcionarios
		classeFuncionario f1 = new classeFuncionario("Carlos");
		f1.setSalario(3200.92);
		emp.admite(f1);

		classeFuncionario f2 = new classeFuncionario("Herbert");
		f2.setSalario(1200.20);
		emp.admite(f2);

		classeFuncionario f3 = new classeFuncionario("Albert");
		f3.setSalario(1500.90);
		emp.admite(f3);

		classeFuncionario f4 = new classeFuncionario("Olé");
		f4.setSalario(65.30);
		emp.admite(f4);

		System.out.println("*=============================*");
		emp.mostraEmpregados(); // lista dados dos funcionários
		System.out.println("*=============================*");
	}
}

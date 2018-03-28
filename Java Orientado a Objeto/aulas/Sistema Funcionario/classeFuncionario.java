class classeFuncionario {
	// atributos	
	private String nome;
	private String departamento;
	private double salario;
	private String dtEntrada;
	private String RG;
	private boolean estaNaEmpresa;
	private static int id; // identificador estático

	// Construtor
	public classeFuncionario(String nome) {
		setNome(nome);
		classeFuncionario.id += 1; // define valor incremental para atributo estático
	}
	
	// Getters e Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDepartamento(String depart) {
		this.departamento = depart;
	}
	public void setSalario(double sal) {
		this.salario = sal;
	}
	public void setDtEntrada(String dtEntrada) {
		this.dtEntrada = dtEntrada;
	}
	public void setRG(String RG) {
		this.RG = RG;
	}

	public String getNome(){
		return this.nome;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	public double getSalario(){
		return this.salario;
	}
	public String getDtEntrada(){
		return this.dtEntrada;
	}
	public String getRG(){
		return this.RG;
	}
	public boolean getEstaNaEmpresa(){
		return this.estaNaEmpresa;
	}

	public int getId() {
		return classeFuncionario.id;
	}

	// métodos
	public void recebeAumentoPerc(double percAumento) {
		this.salario = this.salario * (percAumento+1); 
		// +10% é o mesmo que multiplicar por 1.1, para preservar o valor e adicionar 10%
	}

	public void recebeAumento(double aumento) {
		this.salario += aumento; // soma um aumento de salario
	}

	public void demite(){
		this.estaNaEmpresa = false;
	}

	public double getGanhoAnual() {
		return this.salario * 12;
	}

	
}

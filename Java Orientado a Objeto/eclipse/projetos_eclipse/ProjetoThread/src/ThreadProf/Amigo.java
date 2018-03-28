package ThreadProf;

public class Amigo {
	private String nome;

	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Amigo(String nome) {
		this.nome = nome;
	}

	public synchronized void reverenciar(Amigo a) {
		System.out.println("Reverenciando amigo " + a.getNome());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.reverenciarDeVolta(this);
		System.out.println("Amigo " + a.getNome() + " reverenciado");
	}

	public synchronized void reverenciarDeVolta(Amigo a) {
		System.out.println("*Amigo reverencia de volta o " + a.getNome());
	}



}

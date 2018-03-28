public class Teste {
	public static void main(String[] args) {
		Executa ex1 = new Executa();
		ex1.setId(1);
		
		Thread t1 = new Thread(ex1);
		t1.start();
		
		
		Executa ex2 = new Executa();
		ex2.setId(2);
		
		Thread t2 = new Thread(ex2);
		t2.start();
		
	}
}

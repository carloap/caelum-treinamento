public class TesteClasseAnonima {
	public static void main(String[] args) {
		//Runnable r = new Executa2();
		//Thread t = new Thread(r);
		//t.start();
		
		
		// utilizando classe anônima, não precisamos criar a classe Executa2, 
		// mas podemos inserir a classe junto com sua implementação direto no main, assim:
		Runnable r2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println(" Programa x valor " + i);
				}
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
		
		// Com o lambda do Java 8, podemos ir mais longe
		Runnable r3 = () -> {
			for (int i = 0; i < 10000; i++) {
				System.out.println("Programa l valor " + i);
			}
		};
		Thread t3 = new Thread(r3);
		t3.start();
		
		
	}
}

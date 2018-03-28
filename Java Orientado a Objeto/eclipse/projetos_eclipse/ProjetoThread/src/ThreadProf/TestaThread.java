package ThreadProf;

public class TestaThread {
	public static void main(String[] args) {
		final Amigo julio = new Amigo("Julio");
		final Amigo andre = new Amigo("Andre");
		
		Thread t1 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				julio.reverenciar(andre);
			}
		});
		t1.start();
		
		Thread t2 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				andre.reverenciar(julio);
				
			}
		});
		t2.start();
		
		
		
		while(true) {
			System.out.println("Thread 1: " + t1.getState());
			System.out.println("Thread 2: " + t2.getState());
		}
		
	}
}

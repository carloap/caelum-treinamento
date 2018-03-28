import java.util.ArrayList;
import java.util.Collection;


public class TestaPerformance {
	public static void main(String[] args) {
		
		System.out.println("Iniciando...");
		
		Collection<Integer> test = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		for (int i = 0; i<total; i++) {
			test.add(i);
		}
		
		for (int i = 0; i < args.length; i++) {
			test.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo desperdiçado: " + tempo + "ms");
		
	}
}

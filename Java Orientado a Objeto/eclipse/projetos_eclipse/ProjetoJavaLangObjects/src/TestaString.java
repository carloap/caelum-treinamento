public class TestaString {
	public static void main(String[] args) {
		String s = "FJ-22";
		s = s.replaceAll("2", "1"); // substitui as substrings (partes da string) mas o retorno precisa ter uma variavel, ou não irá a lugar algum
		System.out.println(s); // retorna "FJ11", o valor do "replaceAll" é perdido.
		// o objeto String não pode ser alterado por causa da referência do "pool de String" para um endereço de memória, para
		
		System.out.println();
		
		String a = "FJ-22"; 
		String b = "FJ-22"; 
		String c = new String("FJ-22");
		
		System.out.println("Comparando Strings a com b: ======================");
		if(a == b) { // retorna true. estou comparando objetos e o b referencia o mesmo "pool" (ou endereço de memória) de a
			System.out.println("Strings iguais - usando ==");
		} else {
			System.out.println("Strings diferentes - usando ==");
		}
		
		if(a.equals(b)) { // retorna true. estou comparando se o valor de b é igual ao valor de a, e ambos são iguais!
			System.out.println("Strings iguais - usando equals");
		} else {
			System.out.println("Strings diferentes - usando equals");
		}

		System.out.println();
		System.out.println("Comparando Strings a com c: ======================");
		if(a == c) { // retorna false. estou comparando objetos e o c é explicitamente um NOVO objeto!
			System.out.println("Strings iguais - usando ==");
		} else {
			System.out.println("Strings diferentes - usando ==");
		}
		
		if(a.equals(c)) { // retorna true. estou comparando se o valor de c é igual ao valor de a, e ambos são iguais!
			System.out.println("Strings iguais - usando equals");
		} else {
			System.out.println("Strings diferentes - usando equals");
		}
		
		
	}
}


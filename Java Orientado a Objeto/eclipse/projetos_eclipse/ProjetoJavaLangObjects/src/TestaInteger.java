public class TestaInteger {
	
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
		if (x1 == x2) { // retorna false, pois compara os objetos nesse caso. Ele serve para tipos primitivos.
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
		
		if (x1.equals(x2)) { // retorna true, pois compara o valor dos objetos, que nesse caso são iguais.
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
		
		
		
		System.out.println("Verificando se Integer sobreescreve toString ========================");
		
		// equals e == da no mesmo aqui
		if (x1.equals( Integer.parseInt("10") )) {
			System.out.println("Opa, é igual!");
		} else {
			System.out.println("Opa, é diferente!");
		}
		
		// essa parte da errado de propósito
		try {
			if (x1.equals(Integer.parseInt("texto"))) { // exceção convertendo string explicita em número
				System.out.println("Opa, é igual!");
			}
		} catch (Exception ex) {
			System.out.println("Mensagem de excessão: " + ex.getMessage());
		}
		
		String z = x1.toString(); // se comporta como string e não pode ser comparado mais com int, por ser tipos diferentes agora
		if (z.equals("10")) {
			System.out.println("ToString se comporta como string");
		}
		
	}
}

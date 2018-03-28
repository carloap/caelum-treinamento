/* Imprimir a soma de 1 até 1000 */
class SomaNumero1a1000 {
	public static void main(String[] args){
		int inicio = 1;	
		int limite = 1000;
		int soma = 0;
		while(inicio<=limite) {
			soma += inicio;
			System.out.println(soma);
			inicio++;
		}
	}
}

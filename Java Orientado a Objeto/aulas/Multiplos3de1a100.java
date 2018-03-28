/* Imprimir todos os multiplos de 3, entre 1 e 100 */
class Multiplos3de1a100 {
	public static void main(String[] args){
		int limite = 100;
		for(int inicio=1; inicio<=limite; inicio++){
			if((inicio % 3) == 0) {
				System.out.println("Multiplo de 3: "+ inicio);
			}
		}

	}
}

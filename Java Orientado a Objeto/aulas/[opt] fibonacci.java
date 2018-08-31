class MinhaClasse {

	/**
	 * função principal para executar!
	 */
	public static void main(String[] args) {
		System.out.println("Olá Mundo");
		System.out.println("2 + 2 = " + (2+2) );

		System.out.println("Sequencia fibonacci valor até 100.... =================================");


		MinhaClasse c = new MinhaClasse();

		int tamanho = 100;
		for(int i = 0 ; i < tamanho ; i++) 
		{
			int retorno_Fibonacci = c.fibonacci(i);
			if(retorno_Fibonacci <= tamanho)
			{
				// Retorna somente até o numero 100 da sequência
				// Sem esse if ele fará 100 vezes a sequencia fibonacci, resultando em uma parábola que tende a infinito +
				System.out.println(" sequencia -> " + c.fibonacci(i) );
				continue;
			}
			break;
			
		}



		// Teste de loop infinito... não rode isso pelo amor de Deus!!!
		MinhaClasse.loop();


	}

	/**
	 * Calcular a sequência fibonacci
	 */
	public int fibonacci(int numero) {
		if(numero==0)
		{
			return 0;
		}
		else if(numero==1)
		{
			return 1;
		}
		return fibonacci(numero-2) + fibonacci(numero-1); 
	}


	/**
	 * Teste com loop, utilizando a estrutura de repetição "while"
	 */
	public static void loop() {

		int inicio = 1;
		int fim = 10;

		while(inicio < fim){
			//System.out.println("isso nunca vai acabar...");
			System.out.println("roda 10x");
			
			inicio = inicio + 1;
		}

	}


}

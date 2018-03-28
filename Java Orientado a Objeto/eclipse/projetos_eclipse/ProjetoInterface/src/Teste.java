public class Teste {
	public static void main(String[] args) {
		AreaCalculavel r = new Retangulo(3,2);
		// r.test() // este método não funciona, pois está com tipo diferente. apenas a classe retângulo utiliza, e a Interface não o implementará
		System.out.println("Area calculavel do retângulo: " + r.calculaArea()); 
		
		AreaCalculavel q = new Quadrado(4);
		System.out.println("Area calculavel do retângulo: " + q.calculaArea());
		
		AreaCalculavel c = new Circulo(6);
		System.out.println("Area calculavel do retângulo: " + c.calculaArea());
		
		
		
	}
}

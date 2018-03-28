
public class TestaPorta {
	public static void main(String[] args) {
		Porta p = new Porta();
		
		p.setDimensaoX(50);
		p.setDimensaoY(90);
		p.setDimensaoX(8);
		
		p.abre();
		
		
		System.out.println(p.estaAberta());
	}
}

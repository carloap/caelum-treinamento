
public class Porta {
	private boolean aberta;
	private String cor;
	private int dimensaoX;
	private int dimensaoY;
	private int dimensaoZ;
	
	// getters e setters
	public int getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(int dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public int getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(int dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public int getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(int dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	
	
	/**
	 * Método abre()
	 * abre a porta
	 */
	public void abre() {
		this.aberta = true;
	}

	/**
	 * Método fecha()
	 * fecha a porta
	 */
	public void fecha() {
		this.aberta = false;
	}
	
	/**
	 * Método pinta()
	 * altera a cor da porta
	 */
	public void pinta(String cor) {
		this.cor = cor;
	}
	
	/**
	 * Método estaAberta()
	 * verifica se está aberta, e retorna valor booleano
	 */
	public boolean estaAberta() {
		return this.aberta;
	}
	
}

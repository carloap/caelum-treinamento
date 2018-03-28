package br.com.caelum.argentum.indicadores;

import br.com.caelum.argentum.modelo.SerieTemporal;

public class MediaMovelPonderada implements Indicador {

	public double calcula(int posicao, SerieTemporal serie) {
		double soma = 0.0;
		int peso = 3;
		
		for (int i = posicao; i > posicao-3; i--) {
			soma += serie.getCandle(i).getFechamento() * peso;
			peso--;
		}
		return soma / 6;
	}
	
	public String toString() {
		return "MMP de Fechamento";
	}
}

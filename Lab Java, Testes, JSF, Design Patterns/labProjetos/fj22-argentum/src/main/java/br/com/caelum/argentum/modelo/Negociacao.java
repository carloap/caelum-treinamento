package br.com.caelum.argentum.modelo;

import java.util.Calendar;

import br.com.caelum.argentum.testes.testeException;

public final class Negociacao {
	private final double preco;
	private final int quantidade;
	private final Calendar data;
	
	public Negociacao(double valor, int quantidade, Calendar data) {
		if (data == null) {
			throw new testeException(); // IllegalArgumentException
		}
		this.preco = valor;
		this.quantidade = quantidade;
		this.data = (Calendar) data.clone();
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Calendar getData() {
		return (Calendar) data.clone();
	}
	
	public double getVolume() {
		return preco * quantidade;
	}

	public boolean isMesmoDia(Calendar outraData) {
		return 
				this.data.get(Calendar.DAY_OF_MONTH) == outraData.get(Calendar.DAY_OF_MONTH) && 
				this.data.get(Calendar.MONTH) == outraData.get(Calendar.MONTH) &&
				this.data.get(Calendar.YEAR) == outraData.get(Calendar.YEAR);
	}
	
	
	
	
}

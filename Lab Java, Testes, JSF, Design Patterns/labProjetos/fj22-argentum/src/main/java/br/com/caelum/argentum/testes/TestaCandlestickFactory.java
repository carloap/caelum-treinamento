package br.com.caelum.argentum.testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class TestaCandlestickFactory {
	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		
		// negociações de teste...
		Negociacao n1 = new Negociacao(40.5, 100, hoje);
		Negociacao n2 = new Negociacao(45.0, 100, hoje);
		Negociacao n3 = new Negociacao(49.8, 100, hoje);
		Negociacao n4 = new Negociacao(53.3, 100, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(n1, n2, n3, n4);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		System.out.println(candle);
		
	}
}

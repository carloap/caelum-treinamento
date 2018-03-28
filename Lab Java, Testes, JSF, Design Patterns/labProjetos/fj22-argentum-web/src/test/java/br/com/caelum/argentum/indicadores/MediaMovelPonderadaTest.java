package br.com.caelum.argentum.indicadores;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.argentum.modelo.SerieTemporal;

public class MediaMovelPonderadaTest {

	@Test
	public void sequenciaSimplesDeCandles() {
		SerieTemporal serie = GeradorDeSerie.criaSerie(1, 2, 3, 4, 5, 6);
		MediaMovelPonderada mmp = new MediaMovelPonderada();
		
		Assert.assertEquals(14.0/6, mmp.calcula(2, serie), 0.00001);
	}

}

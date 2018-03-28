package br.com.caelum.argentum.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import br.com.caelum.argentum.testes.testeException;

import junit.framework.Assert;

public class NegociacaoTest {
	
	@Test
	public void dataDaNegociacaoEhImutavel() {
		// se criar uma negociacao no dia 15...
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		Negociacao n = new Negociacao(10, 5, c);
		
		// ainda que eu tente mudar a data para 20...
		n.getData().set(Calendar.DAY_OF_MONTH, 20);
		
		// ele continua no dia 15.
		Assert.assertEquals(15, n.getData().get(Calendar.DAY_OF_MONTH));
	}
	
	@Test(expected=testeException.class)
	public void naoCriaNegociacaoComDataNula() {
		new Negociacao(10, 5, null);
	}
	
	
	@Test
	public void mesmoMilissegundoEhDoMesmoDia() {
		Calendar agora = Calendar.getInstance();
		Calendar mesmoMomento = (Calendar) agora.clone();
		
		Negociacao n = new Negociacao(40.0, 100, agora);
		Assert.assertTrue(n.isMesmoDia(mesmoMomento));
	}
	
	
	@Test
	public void comHorariosDiferentesEhDoMesmoDia() {
		// usando GregorianCalendar(ano, mes, dia, hora, minuto);
		Calendar manha = new GregorianCalendar(2011, 10, 20, 8, 30);
		Calendar tarde = new GregorianCalendar(2011, 10, 20, 15, 30);
		
		Negociacao n = new Negociacao(40.0, 100, manha);
		Assert.assertTrue(n.isMesmoDia(tarde));
	}
	
	@Test
	public void mesmoDiaMasMesesDiferentesNaoSaoDoMesmoDia() {
		Calendar mes1 = new GregorianCalendar(2011, 10, 20, 8, 30);
		Calendar mes2 = new GregorianCalendar(2011, 11, 20, 8, 30);
		
		Negociacao n = new Negociacao(40.0, 100, mes1);
		Assert.assertFalse(n.isMesmoDia(mes2));
	}
	
	@Test
	public void mesmoDiaEMesMasAnosDiferentesNaoSaoDoMesmoDia() {
		Calendar ano1 = new GregorianCalendar(2011, 10, 20, 8, 30);
		Calendar ano2 = new GregorianCalendar(2012, 10, 20, 8, 30);
		
		Negociacao n = new Negociacao(40.0, 100, ano1);
		Assert.assertFalse(n.isMesmoDia(ano2));
	}
	
}

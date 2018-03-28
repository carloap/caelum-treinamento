package br.com.caelum.argentum.modelo;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import br.com.caelum.argentum.reader.LeitorXML;

public class LeitorXMLTest {

	@Test
	public void carregaXmlComUmaNegociacaoEmListaUnitaria() {
		// xml aqui
		String xmlDeTeste = "<list>" +
							"	<negociacao>" +
							" 		<valor>43.5</valor>" +
							" 		<quantidade>1000</quantidade>" +
							" 		<data>" +
							"			<time>1322233344455</time>" +
							"		</data>" +
							"	</negociacao>" +
							"</list>";
		
		LeitorXML leitor = new LeitorXML();
		InputStream xml = new ByteArrayInputStream(xmlDeTeste.getBytes());
		List<Negociacao> negociacoes = leitor.carrega(xml);
		
		Assert.assertEquals(1, negociacoes.size());
		
		for(Negociacao n : negociacoes) {
			Assert.assertEquals(43.5, n.getPreco()); // compara valor
			Assert.assertEquals(1000, n.getQuantidade()); // compara valor
		}
		
	}

}

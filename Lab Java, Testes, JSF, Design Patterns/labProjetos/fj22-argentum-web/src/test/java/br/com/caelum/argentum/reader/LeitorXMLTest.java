package br.com.caelum.argentum.reader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.argentum.modelo.Negociacao;

public class LeitorXMLTest {

    @Test
    public void testLeitorDeXMlCarregaListaDeNegocio() {
        String xmlDeTeste = 
        		"<list>" 
        		+ "    <negociacao>" 
        		+ "        <preco>43.5</preco>"
                + "        <quantidade>1000</quantidade>" 
        		+ "        <data>"
                + "            <time>1322233344455</time>" 
        		+ "        </data>" 
                + "    </negociacao>"
                + "</list>";

        LeitorXML leitor = new LeitorXML();

        InputStream xml = new ByteArrayInputStream(xmlDeTeste.getBytes());
       
        List<Negociacao> negocios = leitor.carrega(xml);

        Assert.assertEquals(negocios.get(0).getPreco(), 43.5, 0.0001);
        Assert.assertEquals(negocios.get(0).getQuantidade(), 1000);
        Assert.assertEquals(negocios.size(), 1);
    }
    
    @Test
    public void testaLinkWebServiceDeXMl() {
    	
    	final String url_ws = "http://argentumws.caelum.com.br/negociacoes";

    	HttpURLConnection connection = null;
		
		try {
			URL url = new URL(url_ws);
			connection = (HttpURLConnection) url.openConnection();
			InputStream content = connection.getInputStream();
			
			LeitorXML leitor = new LeitorXML(); // ler os dados xml
	       
	        List<Negociacao> negocios = leitor.carrega(content); // passar para uma lista

	        Assert.assertEquals(negocios.get(0).getPreco(), 417.22, 0.0001);
	        Assert.assertEquals(negocios.get(0).getQuantidade(), 24);
	        Assert.assertEquals(negocios.size(), 244);
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			connection.disconnect();
		}

        
    }

}


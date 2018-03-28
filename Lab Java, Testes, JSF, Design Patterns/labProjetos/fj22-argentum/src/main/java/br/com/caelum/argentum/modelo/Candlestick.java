package br.com.caelum.argentum.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Candlestick {
	private final double abertura;
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;
	
	public Candlestick(double abertura, double fechamento, double minimo,
			double maximo, double volume, Calendar data) {
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}

	public double getAbertura() {
		return abertura;
	}

	public double getFechamento() {
		return fechamento;
	}

	public double getMinimo() {
		return minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public double getVolume() {
		return volume;
	}

	public Calendar getData() {
		return data;
	}
	
	// ação está em alta
	public boolean isAlta() {
		return this.abertura < this.fechamento;
	}
	
	// ação está em baixa
	public boolean isBaixa() {
		return this.abertura > this.fechamento;
	}
	
	@Override
	public String toString() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  //HH:mm:ss  
        String date = null;    
        try{    
        	date = dateFormat.format(this.data.getTime());    
        }catch(Exception e) {    
            e.getMessage();  
        }
		
        String saida;
        
        saida = "Abertura: " + this.getAbertura() + "\n"
        		+"Fechamento: " + this.getFechamento() + "\n"
        		+"Mínimo: " + this.getMinimo() + "\n"
        		+"Máximo: " + this.getMaximo() + "\n"
        		+"Volume: " + this.getVolume() + "\n"
        		+"Data: " + date;
        
		return saida;
		// Ok! supimpa!
	}
	
}

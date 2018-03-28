package br.com.caelum.argentum.grafico;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartModel;
import org.primefaces.model.chart.LineChartSeries;

import br.com.caelum.argentum.indicadores.Indicador;
import br.com.caelum.argentum.modelo.SerieTemporal;

public class GeradorModeloGrafico {
	// vamos gerar o gráfico com o primefaces!! :)
	
	// atributos: serie, comeco, fim e grafico
	// (todos gerados com Ctrl+1, conforme você criar o construtor)
	// importe as classes com Ctrl+Shift+O
	
	private SerieTemporal serie;
	private int comeco;
	private int fim;
	private CartesianChartModel modeloGrafico;

	public GeradorModeloGrafico(SerieTemporal serie, int comeco, int fim) {
		this.serie = serie;
		this.comeco = comeco;
		this.fim = fim;
		this.modeloGrafico = new CartesianChartModel();
	}
	
	public void plotaIndicador(Indicador indicador) {
		LineChartSeries chartSerie = new LineChartSeries(indicador.toString());
		
		for (int i = this.comeco; i <= this.fim; i++) {
			double valor = indicador.calcula(i, this.serie);
			chartSerie.set(i,valor);
		}
		this.modeloGrafico.addSeries(chartSerie);
	}
	
	public ChartModel getModeloGrafico() {
		return this.modeloGrafico;
	}
	
	
	
}

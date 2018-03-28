package br.com.banco;
import br.com.banco.conta.Conta;
import br.com.banco.conta.ContaCorrente;
import br.com.banco.conta.ContaPoupanca;


public class TestaConta {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		// saldos
		//cc.deposita(10);
		//cp.deposita(50);
		
		cc.atualiza(0.01);
		cp.atualiza(0.2);
		
		System.out.println("O saldo de c.Corr é: " + cc.getSaldo());
		System.out.println("O saldo de c.Poup é: " + cp.getSaldo());
		
		//
		Conta[] x = new Conta[10];
		x[0] = cc;
		
		
	}
}

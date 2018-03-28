package bind;

import java.rmi.Naming;
import java.rmi.Remote;
import java.util.Scanner;

import bind.servicos.InterfaceServ;

public class ClienteBind implements Remote {
	
	public static void main(String[] args) {
		// entrada por teclado - insira o IP do servidor
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o IP e Porta do servidor: ");
        String enderecoIP = in.nextLine();
        
        // Tenta efetuar conexão com o servidor
		try {
			// Abre conexão com o servidor via binder
			InterfaceServ obj_rmi = (InterfaceServ) Naming.lookup("rmi://"+ enderecoIP +"/Server"); // aqui realizamos um Cast do Remote para o tipo "InterfaceServ"
            System.out.println("Conexão estabelecida!");
            
            System.out.println( obj_rmi.soma(2, 5) ); // executa rotina que está no servidor
            
        	Scanner teclado = new Scanner(System.in);
        	String msg = teclado.nextLine();
            while(!msg.isEmpty()) {
            	System.out.println(msg);
            	msg = teclado.nextLine();
            }
            teclado.close();
            
        } catch (Exception e) {
            System.out.println("Erro ao estabelecer conexão. " + e.getMessage());
        }
		in.close();
	}
}

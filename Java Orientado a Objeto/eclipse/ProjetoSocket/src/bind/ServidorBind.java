package bind;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import bind.servicos.Servicos;

public class ServidorBind {
	public static void main(String[] args) throws UnknownHostException {

		InetAddress addr = Inet4Address.getLocalHost();
		int porta = 9999;
		
		// Tenta iniciar o servidor
		try {
			LocateRegistry.createRegistry(porta); // Registra porta para aceitar chamadas
			
			// Instancia objeto do tipo remote para o binder Serviços
			Remote svc = new Servicos();
			
			// Abre conexão para o binder
			Naming.rebind("rmi://" + addr.getHostAddress() + ":" + porta + "/Server", svc);
			System.out.println("Servidor disponível em: " + addr.getHostAddress() + ":" + porta);
			
		} catch (RemoteException e) {
			System.out.println("Erro iniciando o servidor");
		} catch (MalformedURLException e) {
			System.out.println("URL inválida");
		}

	}
}

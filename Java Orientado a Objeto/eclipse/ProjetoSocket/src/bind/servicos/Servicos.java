package bind.servicos;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject; // exportar objeto remoto com JRMP

public class Servicos extends UnicastRemoteObject implements InterfaceServ {

	// Construtor
	public Servicos() throws RemoteException {
        // inicializa
	}
	
	public int soma(int a, int b) {
		return a + b;
	}
	
	void enviarMsg() throws RemoteException {
		
	}
}

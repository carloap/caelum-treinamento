package bind.servicos;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceServ extends Remote {

	public int soma(int a, int b) throws RemoteException;
}

package socket;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	
	public static void main(String[] args) throws IOException {
		
		/**
		 * Pega IPv4 da maquina servidor para instanciar o ServerSocket
		 */
        InetAddress addr = Inet4Address.getLocalHost();
	    int porta = 9999;
        
        /**
		 * Inicializa o ServerSocket utilizando uma Porta
		 */
		ServerSocket server = new ServerSocket(porta);
		
		System.out.println("Servidor disponivel em: " + addr.getHostAddress() + ":" + porta);
		
		Socket client = server.accept();
		String ipCliente = client.getInetAddress().getHostAddress();
		System.out.println("Cliente conectado: " + ipCliente);
		
		Scanner cli = new Scanner(client.getInputStream());
		while (cli.hasNextLine()) {
			System.out.println("["+ ipCliente +"] diz: " + cli.nextLine());
		}
		
		cli.close();
		client.close();
		server.close();
		
	}
}

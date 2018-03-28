package socket;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {

		System.out.println("Insira o IP do servidor: ");
		Scanner con = new Scanner(System.in);
		String ip = con.nextLine();
		
		try {
			Socket client = new Socket(ip, 9999);
			System.out.println("Cliente conectado no server");

			PrintStream saida = new PrintStream(client.getOutputStream());
			Scanner tecladoClient = new Scanner(System.in);
			while (tecladoClient.hasNextLine()) {
				saida.println(tecladoClient.nextLine());
			}
			
			saida.close();
			tecladoClient.close();
			client.close();
			
		} catch (Exception ex) {
			System.out.println("Falha ao conectar no servidor.");
		}
		con.close();
	}

}

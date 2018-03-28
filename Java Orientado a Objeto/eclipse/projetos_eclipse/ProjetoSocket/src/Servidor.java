import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);
		
		String ip = InetAddress.getLocalHost().getHostAddress();
	    System.out.println("Servidor disponível em " + ip );
		
		Socket client = server.accept();
		System.out.println("Nova conexão com o cliente " + client.getInetAddress().getHostAddress());
		
		Scanner sc = new Scanner(client.getInputStream());
		while (sc.hasNextLine()) {
			System.out.println("Mensagem: " + sc.nextLine());
		}
		
		
		
	}
}

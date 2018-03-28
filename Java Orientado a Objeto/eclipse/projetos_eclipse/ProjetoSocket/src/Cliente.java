import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Insira o IP do servidor: ");
		Scanner con = new Scanner(System.in);
		String ip = con.nextLine();
		try {
			Socket cliente = new Socket(ip, 9999);
			System.out.println("Cliente conectado");
	
			Scanner t = new Scanner(System.in);
			PrintStream saida = new PrintStream(cliente.getOutputStream());
	
			while (t.hasNextLine()) {
				saida.println(t.nextLine());
	
			}
			saida.close();
			t.close();
		} catch (Exception ex) {
			System.out.println("Erro: não foi possível conectar-se ao servidor.");
		}
		
		
	}
}

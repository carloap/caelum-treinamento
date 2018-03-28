import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class TesteIOScanner {
	public static void main(String[] args) throws FileNotFoundException {
		InputStream is = new FileInputStream("arq.txt");
		Scanner in = new Scanner(is);
		
		System.out.println("Digite sua mensagem: ");
		while (in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		in.close();
	}
}

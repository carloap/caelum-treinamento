import java.io.*;

public class TestaIO {
	public static void main(String[] args) {
		
		try{
			InputStream is = new FileInputStream("arq.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String s = br.readLine();
			while (!s.isEmpty()) {
				System.out.println("msg: "+ s);
				s = br.readLine();
			}
			br.close();
		} catch (IOException ex) {
			System.out.println("Excessão: " + ex.getMessage());
		}
		
		
	}
}

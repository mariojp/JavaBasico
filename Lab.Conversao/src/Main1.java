import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
		// java.util.List
		ArrayList<String> palavras = new ArrayList<String>();
		palavras.add("Carro");
		palavras.add("Moto");
		palavras.add("Ônibus");

		for (String p : palavras) {
			System.out.println(p);
		}

	}

}

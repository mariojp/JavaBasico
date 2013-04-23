import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		// java.util.List
		// java.util.ArrayList
		LinkedList<String> palavras = new LinkedList<String>();
		palavras.add("Carro");
		palavras.add("Moto");
		palavras.add("Ônibus");

		List<String> palavraList = palavras;
		ArrayList<String> palavraArrayList = (ArrayList<String>) palavraList;

		for (String p : palavraArrayList) {
			System.out.println(p);
		}
	}

}

import java.util.ArrayList;
import java.util.List;


public class Main2 {
	
	
	public static void main(String[] args) {
		// java.util.List
		// java.util.ArrayList
		ArrayList<String> palavras = new ArrayList<String>();
		palavras.add("Carro");
		palavras.add("Moto");
		palavras.add("Ônibus");
		
		List<String> palavraList = palavras;
		ArrayList<String> palavraArrayList = (ArrayList<String>) palavraList; // ERRO
				
		for (String p : palavraArrayList)
		{
			System.out.println(p);
		}
	}

}

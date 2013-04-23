import java.io.File;

public class Main {

	public static void main(String[] args) {
		String[] possiveisArquivos = { "1.txt", "2.txt", "3.txt" };
		File arquivoEscolhido = null;
		for (String f : possiveisArquivos) {
			File file = new File(f);
			if (file.exists()) {
				arquivoEscolhido = file;
				break;
			}
		}
		if (arquivoEscolhido == null) {
			System.out
					.println("Nenhum arquivo de configuração foi encontrado");
		} else {
			System.out.println("Arquivo escolhido foi "
					+ arquivoEscolhido.getName());
		}
	}
}

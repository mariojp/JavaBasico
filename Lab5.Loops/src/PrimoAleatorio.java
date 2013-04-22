import java.util.Random;

public class PrimoAleatorio {

	
	public static void main(String[] args) {
		Random random = new Random();
		int numero = random.nextInt(1024);
		int divisores = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				divisores++;
			}
		}
		if (divisores == 2) {
			System.out.println("O numero " + numero + " é primo");
		} else {
			System.out.println("O numero " + numero + " não é primo");
		}

	}

}

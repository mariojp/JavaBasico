import java.util.Random;

public class NumerosAleatorios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		// Imprime de 1 até 10
		// a cada impressão tem
		// 50% de chance de parar
		for (int i = 0; i < 10; ++i) {
			System.out.println(i + 1);
			// Gera um número inteiro e aleatório entre [0; 2[
			if (random.nextInt(2) == 0) {
				break;
			}
		}
	}

}

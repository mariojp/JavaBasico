
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String palavra = "ABBA";
		char[] array = palavra.toCharArray();
		boolean palindromo = true;
		for (int i = 0, j = array.length-1; i < (array.length / 2); i++, j--) {
			if (array[i] != array[j]) {
				palindromo = false;
			}
		}

		if (palindromo) {
			System.out.println("A palavra " + palavra + " é um palíndromo.");
		} else {
			System.out
					.println("A palavra " + palavra + " não é um palíndromo.");
		}
	}

}

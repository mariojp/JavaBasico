import java.util.Scanner;

public class MainFinally {

	public static void main(String[] args) {

		try {

			System.out.println("Digite uma palavra: ");
			Scanner scanner = new Scanner(System.in);
			String s = scanner.nextLine();
			System.out.println("CharAt(3) = " + s.charAt(3));

		} catch (StringIndexOutOfBoundsException ex) {
			System.out.println("ERROR: String out of bounds");
		} finally {
			System.out.println("Finally rodou");
		}
	}
}

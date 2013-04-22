import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.print("Digite um digito: ");
		
		// Leia o resultado
		Scanner scanner = new Scanner(System.in);
		
		// Leia a linha contendo o codigo
		String codigo = scanner.next();
		
		//Liberar o recurso
		scanner.close();
		
		switch (codigo) {
		case "1":
			System.out.println("Um");
			break;
		case "2":
			System.out.println("Dois");
			break;
		case "3":
			System.out.println("Três");
			break;
		case "4":
			System.out.println("Quatro");
			break;
		case "5":
			System.out.println("Cinco");
			break;
		case "6":
			System.out.println("Seis");
			break;
		default: System.out.println(codigo);

		}
	}

}

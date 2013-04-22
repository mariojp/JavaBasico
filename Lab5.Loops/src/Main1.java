public class Main1 {

	public static void main(String[] args) {
		int base = 5;
		int expoente = 3;
		int total = 1;
		while (expoente > 0) {
			total *= base;
			--expoente;
		}
		System.out.println(total);
	}

}

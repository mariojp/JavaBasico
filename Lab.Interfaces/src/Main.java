public class Main {

	public static void main(String[] args) {
		Taxas taxas = new Taxas();
		for (double taxa : taxas.getTaxas()) {
			System.out.println(taxa);
		}

		
		for (double taxa : taxas) {
			System.out.println(taxa);
		}
	}
}

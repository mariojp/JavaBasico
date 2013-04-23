public class MainNullPointer {

	public static void test() {
		String s = null;
		s.charAt(0);
	}

	public static void main(String[] args) {

		try {
			MainNullPointer.test();
		} catch (NullPointerException ex) {
			System.out.println("Exceção de ponteiro nulo capturada");
		}
	}
}

public class MainIndexOutOfBounds {
	
	
	
	public static void main(String[] args) {
		try {
			String s = "Teste";
			char ch = s.charAt(5);

			System.out.println(ch);
		} catch (NullPointerException ex) {
			System.out.println("Ponteiro nulo");
		} catch (StringIndexOutOfBoundsException ex) {
			System.out.println("String fora dos limites");
		}
	}
}

public class MainGenerico {

	public static void main(String[] args) {
	try {
		String s = "Teste";		
		char ch = s.charAt(5);
		System.out.println(ch);
	} catch (Throwable ex) {
		System.out.println("Erro na utilização do sistema, por favor consulte o manual");
	}
}
}

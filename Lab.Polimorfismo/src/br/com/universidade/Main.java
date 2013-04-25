package br.com.universidade;

public class Main {

	public static void main(String[] args) {
		LoginCreatorInterface creator = new SobrenomeNomeLoginCreator();
		String resultado = creator.generate("Jose", "Silva");
		System.out.println(resultado);
	}

}

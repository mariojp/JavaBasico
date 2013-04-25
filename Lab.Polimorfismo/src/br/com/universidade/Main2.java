package br.com.universidade;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LoginCreatorFactory factory = new LoginCreatorFactory();
		LoginCreatorInterface loginCreator = factory.construct();
		String login = loginCreator.generate("Jose", "Silva");
		System.out.println(login);
	}
}

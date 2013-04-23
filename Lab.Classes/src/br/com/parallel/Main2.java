package br.com.parallel;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Produto agua = new Produto(); Produto leite = new Produto();
		Produto qualquer = null; qualquer = agua;
		agua = leite;
		System.out.println(agua == qualquer);
		System.out.println(agua == leite);
		System.out.println(leite == qualquer);
	}

}

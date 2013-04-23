package br.com.parallel;

public class Main1 {

	public static void main(String[] args) {
		Produto agua = new Produto();
		Produto leite = new Produto();
		Produto qualquer = null;
		System.out.println(agua == qualquer);
		System.out.println(agua == leite);
		System.out.println(leite == qualquer);
	}
}

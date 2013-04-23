package br.com.parallel;

public class Main4 {

	
	public static void main(String[] args) {
		Produto p1 = new Produto("Água", 1.50);
		Produto p2 = new Produto("Leite", 2.50);
		System.out.println(p1.getNome() + " " + p1.getPreco());
		System.out.println(p2.getNome() + " " + p2.getPreco());
		System.out.println("Programa rodou sem problemas");
	}

}

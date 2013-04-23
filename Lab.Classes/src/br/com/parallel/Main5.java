package br.com.parallel;

public class Main5 {

	public static void main(String[] args) {
		if (Produto.PermiteVenda) {
			System.out.println("Venda dos produto é permitida");
		} else {
			System.out.println("Venda dos produto está bloqueada");
		}
	}

}

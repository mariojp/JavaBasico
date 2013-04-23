package br.com.parallel;

public class Produto {
	
	
	public static boolean PermiteVenda = true;

	private String nome;
	private double preco;

	public Produto() {
		System.out.println("Construtor padrão");
		this.nome = "";
		this.preco = 0.0;
	}

	public Produto(String nome, double preco) {
		System.out.println("Construtor de dois parâmetros");
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}

package br.com.universidade;

public class SobrenomeNomeLoginCreator implements LoginCreatorInterface {

	@Override
	public String generate(String nome, String sobrenome) {
		return sobrenome + nome.charAt(0);
	}

}

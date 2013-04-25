package br.com.universidade;

public class NomeSepSobrenomeLoginCreator implements LoginCreatorInterface {

	
	@Override
	public String generate(String nome, String sobrenome) {
		return nome.toLowerCase() + "." + sobrenome.toLowerCase();
	}

}

package br.com.universidade;

public class LoginCreatorFactory {

	public LoginCreatorInterface construct(){
		String tipoLogin = "nome-sep-sobrenome";
	 
		if (tipoLogin.equals("sobrenome-nome")) {
			return new SobrenomeNomeLoginCreator();
		} else if (tipoLogin.equals("nome-sep-sobrenome")){
			return new NomeSepSobrenomeLoginCreator();
		} else {
			throw new RuntimeException("LoginCreator "+ tipoLogin + " inválido");
		}
	}
}

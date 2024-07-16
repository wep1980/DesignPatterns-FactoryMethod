package br.com.wepdev.LIB.resolvendo_problema_parte_1.dominio;

public class ContatoResolvendoProblemaParte1 {

	private String nome;
	private String email;

	public ContatoResolvendoProblemaParte1(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}

package br.com.wepdev.LIB.parte_1.dominio;

public class ContatoLIB {

	private String nome;
	private String email;

	public ContatoLIB(String nome, String email) {
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

package br.com.wepdev.LIB.parte_1.maladireta;



import br.com.wepdev.LIB.parte_1.dominio.ContatoLIB;
import br.com.wepdev.LIB.parte_1.dominio.ContatosInterfaceLIB;

import java.util.List;

public abstract class MalaDiretaLIB {

	protected abstract ContatosInterfaceLIB criarContatos();
	
	public final boolean enviarEmail(String mensagem) {
		List<ContatoLIB> contatos = criarContatos().todos();
		
		System.out.println("Conectando no servidor SMTP...");
		System.out.println("Mensagem a ser enviada: " + mensagem);
		System.out.println();
		
		for (ContatoLIB contato : contatos) {
			System.out.println("From: <contato@algaworks.com>");
			System.out.printf("To: [%s] <%s>\n", contato.getNome(), contato.getEmail());
			System.out.println(mensagem);
			System.out.println();
		}
		
		return true;
	}
	
}

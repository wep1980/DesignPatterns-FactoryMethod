package br.com.wepdev.LIB.resolvendo_problema_parte_1.maladireta;



import br.com.wepdev.LIB.resolvendo_problema_parte_1.dominio.ContatoResolvendoProblemaParte1;
import br.com.wepdev.LIB.resolvendo_problema_parte_1.dominio.ContatosResolvendoProblemasParte1;

import java.util.List;

public abstract class MalaDiretaResolvendoProblemaParte1 {

	protected abstract ContatosResolvendoProblemasParte1 criarContatos();
	
	public final boolean enviarEmail(String mensagem) {
		List<ContatoResolvendoProblemaParte1> contatos = criarContatos().todos();
		
		System.out.println("Conectando no servidor SMTP...");
		System.out.println("Mensagem a ser enviada: " + mensagem);
		System.out.println();
		
		for (ContatoResolvendoProblemaParte1 contato : contatos) {
			System.out.println("From: <contato@algaworks.com>");
			System.out.printf("To: [%s] <%s>\n", contato.getNome(), contato.getEmail());
			System.out.println(mensagem);
			System.out.println();
		}
		
		return true;
	}
	
}

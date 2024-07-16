package br.com.wepdev.CLIENTE.resolvendo_problema_parte_2.XML;

import br.com.wepdev.LIB.resolvendo_problema_parte_1.dominio.ContatosResolvendoProblemasParte1;
import br.com.wepdev.LIB.resolvendo_problema_parte_1.maladireta.MalaDiretaResolvendoProblemaParte1;


public class MalaDiretaXML extends MalaDiretaResolvendoProblemaParte1 {

	private String nomeArquivo;

	public MalaDiretaXML(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@Override
    protected ContatosResolvendoProblemasParte1 criarContatos() {
	    return new ContatosXML(nomeArquivo);
    }

}

package br.com.wepdev.CLIENTE.resolvendo_problema_parte_2.CSV;

import br.com.wepdev.LIB.resolvendo_problema_parte_1.dominio.ContatosResolvendoProblemasParte1;
import br.com.wepdev.LIB.resolvendo_problema_parte_1.maladireta.MalaDiretaResolvendoProblemaParte1;


public class MalaDiretaCSV extends MalaDiretaResolvendoProblemaParte1 {

	private String nomeArquivo;
	
	public MalaDiretaCSV(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@Override
    protected ContatosResolvendoProblemasParte1 criarContatos() {
	    return new ContatosCSV(nomeArquivo);
    }

}

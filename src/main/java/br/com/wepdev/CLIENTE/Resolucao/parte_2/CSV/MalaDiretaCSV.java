package br.com.wepdev.CLIENTE.Resolucao.parte_2.CSV;

import br.com.wepdev.LIB.parte_1.dominio.ContatosInterfaceLIB;
import br.com.wepdev.LIB.parte_1.maladireta.MalaDiretaLIB;


public class MalaDiretaCSV extends MalaDiretaLIB {

	private String nomeArquivo;
	
	public MalaDiretaCSV(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@Override
    protected ContatosInterfaceLIB criarContatos() {
	    return new ContatosCSV(nomeArquivo);
    }

}

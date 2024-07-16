package br.com.wepdev.CLIENTE.Resolucao.parte_2.XML;

import br.com.wepdev.LIB.parte_1.dominio.ContatosInterfaceLIB;
import br.com.wepdev.LIB.parte_1.maladireta.MalaDiretaLIB;


public class MalaDiretaXML extends MalaDiretaLIB {

	private String nomeArquivo;

	public MalaDiretaXML(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@Override
    protected ContatosInterfaceLIB criarContatos() {
	    return new ContatosXML(nomeArquivo);
    }

}

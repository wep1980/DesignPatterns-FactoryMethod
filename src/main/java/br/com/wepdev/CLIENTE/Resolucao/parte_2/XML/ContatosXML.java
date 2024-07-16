package br.com.wepdev.CLIENTE.Resolucao.parte_2.XML;

import java.net.URL;
import java.util.List;

import br.com.wepdev.LIB.parte_1.dominio.ContatoLIB;
import br.com.wepdev.LIB.parte_1.dominio.ContatosInterfaceLIB;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class ContatosXML implements ContatosInterfaceLIB {

	private String nomeArquivo;
	
	public ContatosXML(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@SuppressWarnings("unchecked")
    @Override
    public List<ContatoLIB> todos() {
		XStream xstream = new XStream();
	    xstream.alias("contatos", List.class);
	    xstream.alias("contato", ContatoLIB.class);
		xstream.addPermission(AnyTypePermission.ANY);
	    
	    URL arquivo = this.getClass().getResource("/" + nomeArquivo);
	    return (List<ContatoLIB>) xstream.fromXML(arquivo);
    }

}

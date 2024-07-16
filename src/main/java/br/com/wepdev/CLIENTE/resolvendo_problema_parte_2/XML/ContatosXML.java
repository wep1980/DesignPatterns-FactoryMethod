package br.com.wepdev.CLIENTE.resolvendo_problema_parte_2.XML;

import java.net.URL;
import java.util.List;

import br.com.wepdev.LIB.resolvendo_problema_parte_1.dominio.ContatoResolvendoProblemaParte1;
import br.com.wepdev.LIB.resolvendo_problema_parte_1.dominio.ContatosResolvendoProblemasParte1;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class ContatosXML implements ContatosResolvendoProblemasParte1 {

	private String nomeArquivo;
	
	public ContatosXML(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@SuppressWarnings("unchecked")
    @Override
    public List<ContatoResolvendoProblemaParte1> todos() {
		XStream xstream = new XStream();
	    xstream.alias("contatos", List.class);
	    xstream.alias("contato", ContatoResolvendoProblemaParte1.class);
		xstream.addPermission(AnyTypePermission.ANY);
	    
	    URL arquivo = this.getClass().getResource("/" + nomeArquivo);
	    return (List<ContatoResolvendoProblemaParte1>) xstream.fromXML(arquivo);
    }

}

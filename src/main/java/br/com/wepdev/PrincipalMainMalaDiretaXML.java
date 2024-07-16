package br.com.wepdev;

import javax.swing.JOptionPane;

import br.com.wepdev.CLIENTE.resolvendo_problema_parte_2.XML.MalaDiretaXML;
import br.com.wepdev.LIB.resolvendo_problema_parte_1.maladireta.MalaDiretaResolvendoProblemaParte1;



public class PrincipalMainMalaDiretaXML {

	public static void main(String[] args) {
	    MalaDiretaResolvendoProblemaParte1 malaDireta = new MalaDiretaXML("contatos.xml");
	    String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem de novo cliente:");
	    boolean status = malaDireta.enviarEmail(mensagem);
	    JOptionPane.showMessageDialog(null, "E-mails enviados: " + status);
    }
	
}

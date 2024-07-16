package br.com.wepdev;

import javax.swing.JOptionPane;

import br.com.wepdev.CLIENTE.Resolucao.parte_2.XML.MalaDiretaXML;
import br.com.wepdev.LIB.parte_1.maladireta.MalaDiretaLIB;



public class PrincipalMainMalaDiretaXML {

	public static void main(String[] args) {
	    MalaDiretaLIB malaDireta = new MalaDiretaXML("contatos.xml");
	    String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem de novo cliente:");
	    boolean status = malaDireta.enviarEmail(mensagem);
	    JOptionPane.showMessageDialog(null, "E-mails enviados: " + status);
    }
	
}

package br.com.wepdev;

import javax.swing.JOptionPane;

import br.com.wepdev.CLIENTE.Resolucao.parte_2.CSV.MalaDiretaCSV;
import br.com.wepdev.LIB.parte_1.maladireta.MalaDiretaLIB;


public class PrincipalMainMalaDiretaCSV {

	public static void main(String[] args) {
	    MalaDiretaLIB malaDireta = new MalaDiretaCSV("contatos.csv");
	    String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");
	    
	    boolean status = malaDireta.enviarEmail(mensagem);
	    
	    JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
    }
	
}

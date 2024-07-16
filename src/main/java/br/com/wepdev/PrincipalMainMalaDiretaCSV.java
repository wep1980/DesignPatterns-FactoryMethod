package br.com.wepdev;

import javax.swing.JOptionPane;

import br.com.wepdev.CLIENTE.resolvendo_problema_parte_2.CSV.MalaDiretaCSV;
import br.com.wepdev.LIB.resolvendo_problema_parte_1.maladireta.MalaDiretaResolvendoProblemaParte1;


public class PrincipalMainMalaDiretaCSV {

	public static void main(String[] args) {
	    MalaDiretaResolvendoProblemaParte1 malaDireta = new MalaDiretaCSV("contatos.csv");
	    String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");
	    
	    boolean status = malaDireta.enviarEmail(mensagem);
	    
	    JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
    }
	
}

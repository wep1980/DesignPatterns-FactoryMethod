package br.com.wepdev;

import br.com.wepdev.problema_a_resolver.maladireta.MalaDireta;

import javax.swing.*;

public class PrincipalProblemaAResolver {

    /**
     * Para essa classe funcionar e necessario alinhar o nome do arquivo com o metodo utilizado na classe
     * MalaDireta
     * @param args
     */
    public static void main(String[] args) {
        MalaDireta malaDireta = new MalaDireta();
        String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem para o e-mail");

        boolean status = malaDireta.enviarEmail("contatos.xml", mensagem);
        System.out.println(status);
    }
}
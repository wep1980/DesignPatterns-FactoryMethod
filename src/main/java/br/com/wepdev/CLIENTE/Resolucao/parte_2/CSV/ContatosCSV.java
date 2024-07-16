package br.com.wepdev.CLIENTE.Resolucao.parte_2.CSV;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

import br.com.wepdev.LIB.parte_1.dominio.ContatoLIB;
import br.com.wepdev.LIB.parte_1.dominio.ContatosInterfaceLIB;


public class ContatosCSV implements ContatosInterfaceLIB {

	private String nomeArquivo;
	
	public ContatosCSV(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@Override
    public List<ContatoLIB> todos() {
		List<ContatoLIB> contatos = new ArrayList<>();
		CSVReader csvReader = null;
		
		try {
			URI uri = this.getClass().getResource("/" + nomeArquivo).toURI();
			File arquivoCsv = new File(uri);
			FileReader fileReader = new FileReader(arquivoCsv);
			csvReader = new CSVReader(fileReader);
		    String [] nextLine;
		    
		    while ((nextLine = csvReader.readNext()) != null) {
		    	contatos.add(new ContatoLIB(nextLine[0].trim(), nextLine[1].trim()));
		    }
		} catch (Exception e) {
			throw new RuntimeException("Erro lendo arquivo csv", e);
		} finally {
			try {
	            csvReader.close();
            } catch (IOException e) { }
		}
		
		return contatos;
    }

}

package br.com.wepdev.CLIENTE.resolvendo_problema_parte_2.CSV;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

import br.com.wepdev.LIB.resolvendo_problema_parte_1.dominio.ContatoResolvendoProblemaParte1;
import br.com.wepdev.LIB.resolvendo_problema_parte_1.dominio.ContatosResolvendoProblemasParte1;


public class ContatosCSV implements ContatosResolvendoProblemasParte1 {

	private String nomeArquivo;
	
	public ContatosCSV(String nomeArquivo) {
	    this.nomeArquivo = nomeArquivo;
    }

	@Override
    public List<ContatoResolvendoProblemaParte1> todos() {
		List<ContatoResolvendoProblemaParte1> contatos = new ArrayList<>();
		CSVReader csvReader = null;
		
		try {
			URI uri = this.getClass().getResource("/" + nomeArquivo).toURI();
			File arquivoCsv = new File(uri);
			FileReader fileReader = new FileReader(arquivoCsv);
			csvReader = new CSVReader(fileReader);
		    String [] nextLine;
		    
		    while ((nextLine = csvReader.readNext()) != null) {
		    	contatos.add(new ContatoResolvendoProblemaParte1(nextLine[0].trim(), nextLine[1].trim()));
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

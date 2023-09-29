package br.edu.infnet.appcoleta_jdk11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta_jdk11.controller.SolicitanteController;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Solicitante;

@Order(4)
@Component
public class SolicitanteLoader implements ApplicationRunner {
	
	@Autowired
	private SolicitanteController solicitanteController;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("arquivos/solicitante.txt");
		BufferedReader leitura = new BufferedReader(file);
		String linha = leitura.readLine();
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");
		
			Solicitante solicitante = new Solicitante(
					campos[0], 
					campos[1], 
					campos[2]
					);
			
			solicitanteController.incluir(solicitante);
			
			linha = leitura.readLine();	
		
			}
		
		leitura.close();
	}

}

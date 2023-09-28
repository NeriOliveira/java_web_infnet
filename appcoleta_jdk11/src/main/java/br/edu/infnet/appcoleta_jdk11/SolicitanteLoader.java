package br.edu.infnet.appcoleta_jdk11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Solicitante;

@Order(4)
@Component
public class SolicitanteLoader implements ApplicationRunner {
	
	private Map<String, Solicitante> mapaSolicitante;
	
	public Collection<Solicitante> obterLista(){
		return mapaSolicitante.values();
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		mapaSolicitante = new HashMap<String, Solicitante>();
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
			
			mapaSolicitante.put(solicitante.getCpf(), solicitante);
			
			linha = leitura.readLine();	
		
			}
		
		for(Solicitante solicitante : mapaSolicitante.values()) {
			System.out.println("[Solicitante " + solicitante.getCpf() + "] Solicitação de coleta realizada com sucesso: " + solicitante);
		}
		
		leitura.close();
	}

}

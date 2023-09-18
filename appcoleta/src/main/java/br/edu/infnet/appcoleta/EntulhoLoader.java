package br.edu.infnet.appcoleta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta.model.negocio.Entulho;
import br.edu.infnet.appcoleta.model.negocio.Entulho.EntulhoClasse;


@Order(3)
@Component
public class EntulhoLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Map<Integer, Entulho> mapaEntulho = new HashMap<Integer, Entulho>();
		
		FileReader file = new FileReader("arquivos/entulho.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");
			
			Entulho entulho = new Entulho(
						campos[0],
						Integer.valueOf(campos[1]), 
						campos[2], 
						Float.valueOf(campos[3]), 
						Boolean.valueOf(campos[4]), 
						Entulho.valueOf(campos[5])
					);
			mapaEntulho.put(entulho.getCodigo(), entulho);
			
			linha = leitura.readLine();
		}
		
		for(Entulho entulho : mapaEntulho.values()) {
			System.out.println("[Entulho " + entulho.getCodigo() + "] Solicitação de coleta realizada com sucesso: " + entulho);
		}
		
		leitura.close();
		
	}

}

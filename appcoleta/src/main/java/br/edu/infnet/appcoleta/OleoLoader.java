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
import br.edu.infnet.appcoleta.model.negocio.Oleo;
import br.edu.infnet.appcoleta.model.negocio.Oleo.OleoTipo;


@Order(1)
@Component
public class OleoLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Map<Integer, Oleo> mapaOleo = new HashMap<Integer, Oleo>();
		
		FileReader file = new FileReader("arquivos/oleo.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");
		
			Oleo oleo = new Oleo(
					campos[0],
					Integer.valueOf(campos[1]),
					campos[2],
					Float.valueOf(campos[3]),
					Boolean.valueOf(campos[4]),
					Oleo.valueOf(campos[5])
				);
			
			mapaOleo.put(oleo.getCodigo(), oleo);
			
			linha = leitura.readLine();
		}
		
		for(Oleo oleo : mapaOleo.values()) {
			System.out.println("[Óleo " + oleo.getCodigo() + "] Solicitação de coleta realizada com sucesso: " + oleo);
		}
		
		leitura.close();
	}

}

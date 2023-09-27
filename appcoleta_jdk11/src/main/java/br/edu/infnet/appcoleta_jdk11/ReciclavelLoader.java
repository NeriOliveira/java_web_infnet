package br.edu.infnet.appcoleta_jdk11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Reciclavel;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Reciclavel.ReciclavelTipo;

@Order(2)
@Component
public class ReciclavelLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Map<Integer, Reciclavel> mapaReciclavel = new HashMap<Integer, Reciclavel>();
		FileReader file = new FileReader("arquivos/reciclavel.txt");
		BufferedReader leitura = new BufferedReader(file);
		String linha = leitura.readLine();
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");
			
			Reciclavel reciclavel = new Reciclavel(
				campos[0],
				Integer.valueOf(campos[1]),
				campos[2],
				Float.valueOf(campos[3]),
				Boolean.valueOf(campos[4]),
				ReciclavelTipo.Vidro
			);
			
			mapaReciclavel.put(reciclavel.getCodigo(), reciclavel);
			
			linha = leitura.readLine();			
		}
		for(Reciclavel reciclavel : mapaReciclavel.values()) {
			System.out.println("[Reciclável " + reciclavel.getCodigo() + "] Solicitação de coleta realizada com sucesso: " + reciclavel);
		}
		leitura.close();
	}
}

package br.edu.infnet.appcoleta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta.model.negocio.Coleta;
import br.edu.infnet.appcoleta.model.negocio.Entulho;
import br.edu.infnet.appcoleta.model.negocio.Reciclavel;
import br.edu.infnet.appcoleta.model.negocio.Residuo;
import br.edu.infnet.appcoleta.model.negocio.Solicitante;
import br.edu.infnet.appcoleta.model.negocio.Entulho.EntulhoClasse;
import br.edu.infnet.appcoleta.model.negocio.Oleo;


@Order(5)
@Component
public class ColetaLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Map<LocalDateTime, Coleta> mapaColeta = new HashMap<LocalDateTime, Coleta>();
		FileReader file = new FileReader("arquivos/coleta.txt");
		BufferedReader leitura = new BufferedReader(file);
		String linha = leitura.readLine();
		String[] campos = null;
		Coleta coleta = null;
		
		while(linha != null) {
			campos = linha.split(";");
			switch(campos[0]) {
			case "C":
				coleta = new Coleta(
						campos[1],
						new Solicitante(campos[2], campos[3], campos[4]),
						new ArrayList<Residuo>()
						);
				mapaColeta.put(coleta.getData(), coleta);
				break;
				
			case "O":
				Oleo oleo = new Oleo(
						campos[1], 
						Integer.valueOf(campos[2]), 
						campos[3], 
						Float.valueOf(campos[4]), 
						Boolean.valueOf(campos[5]),
						Oleo.valueOf(campos[6])
					);
				coleta.getResiduos().add(oleo);
				break;
				
			case "R":
				Reciclavel reciclavel = new Reciclavel(
						campos[1], 
						Integer.valueOf(campos[2]), 
						campos[3], 
						Float.valueOf(campos[4]), 
						Boolean.valueOf(campos[5]), 
						Reciclavel.valueOf(campos[6])
					);
				coleta.getResiduos().add(reciclavel);
				break;
				
			case "E":
				Entulho entulho = new Entulho(
						campos[1], 
						Integer.valueOf(campos[2]), 
						campos[3], 
						Float.valueOf(campos[4]), 
						Boolean.valueOf(campos[5]), 
						Entulho.valueOf(campos[6])
					);
				coleta.getResiduos().add(entulho);
				break;
			}
			linha = leitura.readLine();
		}
		for(Coleta c : mapaColeta.values()) {
			System.out.println("[Coleta] Solicitação incluida com sucesso: " + c);
		}
		leitura.close();
	}

}

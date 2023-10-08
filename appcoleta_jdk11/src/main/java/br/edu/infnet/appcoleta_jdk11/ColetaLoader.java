package br.edu.infnet.appcoleta_jdk11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Coleta;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Entulho;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Reciclavel;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Residuo;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Solicitante;
import br.edu.infnet.appcoleta_jdk11.model.service.ColetaService;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Oleo;


@Order(5)
@Component
public class ColetaLoader implements ApplicationRunner {
	
	@Autowired
	private ColetaService coletaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		//Map<LocalDateTime, Coleta> mapaColeta = new HashMap<LocalDateTime, Coleta>();
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
				coletaService.mapaColeta.put(coleta.getData(), coleta);
				//mapaColeta.put(coleta.getData(), coleta);
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
			
			coletaService.incluir(coleta);
			
			
			linha = leitura.readLine();
		}

		leitura.close();
	}

}

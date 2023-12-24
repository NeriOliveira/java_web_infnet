package br.edu.infnet.appcoleta_jdk11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Coleta;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Entulho;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Oleo;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Reciclavel;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Residuo;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Solicitante;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.service.ColetaService;


@Order(7)
@Component
public class ColetaLoader implements ApplicationRunner {
	
	@Autowired
	private ColetaService coletaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Map<LocalDateTime, Coleta> mapaColeta = new HashMap<LocalDateTime, Coleta>();
		
		FileReader file = new FileReader("arquivos/coletaSolicitante.txt");
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
						new Solicitante(Integer.valueOf(campos[2])),
						new ArrayList<Residuo>()
						);
				
				//coletaService.incluir(coleta);
				break;
				
			case "O":
				coleta.getResiduos().add(new Oleo(Integer.valueOf(campos[1])));
				break;
				
			case "R":
				coleta.getResiduos().add(new Reciclavel(Integer.valueOf(campos[1])));
				break;
				
			case "E":
				coleta.getResiduos().add(new Entulho(Integer.valueOf(campos[1])));
				break;
			}
			coleta.setUsuario(new Usuario(1));
			coleta.setData(LocalDateTime.now().minusDays(7).truncatedTo(ChronoUnit.MINUTES));
			coletaService.incluir(coleta);
			linha = leitura.readLine();
		}
		
		
		
		for(Coleta c: mapaColeta.values()) {
//			coletaService.incluir(c);
			System.out.println("[Coleta]  Inclusão realizada com sucesso: " + c);
		}

		leitura.close();
	}

}

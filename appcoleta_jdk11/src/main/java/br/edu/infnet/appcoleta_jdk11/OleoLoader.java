package br.edu.infnet.appcoleta_jdk11;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Oleo;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.service.OleoService;


@Order(4)
@Component
public class OleoLoader implements ApplicationRunner {
	
	@Autowired
	private OleoService oleoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
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
			
			oleo.setUsuario(new Usuario(Integer.valueOf(campos[6])));
			
			oleoService.incluir(oleo);
			
			linha = leitura.readLine();
		}
		
		leitura.close();
	}

}

package br.edu.infnet.appcoleta_jdk11;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Entulho;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.service.EntulhoService;


@Order(6)
@Component
public class EntulhoLoader implements ApplicationRunner {
	
	@Autowired
	private EntulhoService entulhoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
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
			
			entulho.setUsuario(new Usuario(Integer.valueOf(campos[6])));
			
			entulhoService.incluir(entulho);
			
			linha = leitura.readLine();
		}
		
		leitura.close();
		
	}

}

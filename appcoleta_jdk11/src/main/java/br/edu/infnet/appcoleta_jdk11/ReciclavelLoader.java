package br.edu.infnet.appcoleta_jdk11;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta_jdk11.controller.ReciclavelController;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Reciclavel;

@Order(2)
@Component
public class ReciclavelLoader implements ApplicationRunner {
	
	@Autowired
	private ReciclavelController reciclavelController;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
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
				Reciclavel.valueOf(campos[5])
			);
			
			reciclavelController.incluir(reciclavel);
			
			linha = leitura.readLine();			
		}

		leitura.close();
	}
}

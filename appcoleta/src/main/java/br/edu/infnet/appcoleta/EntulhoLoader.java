package br.edu.infnet.appcoleta;

import java.io.BufferedReader;
import java.io.FileReader;

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
		
		FileReader file = new FileReader("bebida.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		System.out.println(leitura.readLine());
		
//		Entulho entulho = new Entulho("Demolição de Parede", 22, "Residencial Pereira", 30, true, EntulhoClasse.A);
//		System.out.println("[Entulho] Solicitação de coleta realizada com sucesso: " + entulho);
		
	}

}

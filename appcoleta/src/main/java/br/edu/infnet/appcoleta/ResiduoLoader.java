package br.edu.infnet.appcoleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta.model.negocio.Coleta;

@Order(1)
@Component
public class ResiduoLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Coleta coleta = new Coleta();
		System.out.println("Solicitação de coleta realizada com sucesso: " + coleta);
	}

}

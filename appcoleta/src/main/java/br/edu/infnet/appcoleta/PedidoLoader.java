package br.edu.infnet.appcoleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta.model.negocio.Coleta;

@Component
public class PedidoLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Coleta c1 = new Coleta();
		System.out.println("Inclusão realiza com sucesso!");
	}

}

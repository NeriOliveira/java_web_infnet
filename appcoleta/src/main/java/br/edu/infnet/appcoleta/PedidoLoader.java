package br.edu.infnet.appcoleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta.model.negocio.Coleta;

@Component
public class PedidoLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Coleta coleta = new Coleta();
		System.out.println("Solicitação de coleta realizada com sucesso: " + coleta);
	}

}

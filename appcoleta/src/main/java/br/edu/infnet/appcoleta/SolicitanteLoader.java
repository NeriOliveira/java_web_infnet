package br.edu.infnet.appcoleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta.model.negocio.Solicitante;

@Order(4)
@Component
public class SolicitanteLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Solicitante solicitante = new Solicitante("Patrick Neri de Oliveira", "433.000.000-80", "patrick.noliveira@al.infnet.edu.br");
				
		System.out.println("[Solicitante] Solicitação de coleta realizada com sucesso: " + solicitante);
	}

}

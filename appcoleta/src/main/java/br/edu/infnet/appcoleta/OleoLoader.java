package br.edu.infnet.appcoleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta.model.negocio.Oleo;
import br.edu.infnet.appcoleta.model.negocio.Oleo.OleoTipo;


@Order(1)
@Component
public class OleoLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Oleo oleo = new Oleo("Óleo de caminhão", 11, null, 70, false, OleoTipo.Automotivo);
		
		System.out.println("[Óleo] Solicitação de coleta realizada com sucesso: " + oleo);
	}

}

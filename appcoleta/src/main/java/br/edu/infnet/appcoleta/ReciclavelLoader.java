package br.edu.infnet.appcoleta;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta.model.negocio.Reciclavel;
import br.edu.infnet.appcoleta.model.negocio.Reciclavel.ReciclavelTipo;

@Order(2)
@Component
public class ReciclavelLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Reciclavel reciclavel = new Reciclavel("Garrafas de Vidro", 33, "Algumas possuem adesivo da marca", 50, true, ReciclavelTipo.Vidro);
				
		System.out.println("[Reciclável] Solicitação de coleta realizada com sucesso: " + reciclavel);
	}

}

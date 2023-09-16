package br.edu.infnet.appcoleta;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta.model.negocio.Coleta;
import br.edu.infnet.appcoleta.model.negocio.Entulho;
import br.edu.infnet.appcoleta.model.negocio.Residuo;
import br.edu.infnet.appcoleta.model.negocio.Solicitante;
import br.edu.infnet.appcoleta.model.negocio.Entulho.EntulhoClasse;


@Order(5)
@Component
public class ColetaLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Solicitante solicitante = new Solicitante("Patrick Neri de Oliveira", "433.000.000-80", "patrick.noliveira@al.infnet.edu.br");

		Entulho ent1 = new Entulho("Demolição de Parede", 22, "Residencial Pereira", 30, true, EntulhoClasse.A);
		Entulho ent2 = new Entulho("Demolição de Piso", 23, "Residencial Pereira", 50, true, EntulhoClasse.B);
		
		List<Residuo> listaResiduos = new ArrayList<Residuo>();		
		listaResiduos.add(ent1);
		listaResiduos.add(ent2);
		
		Coleta coleta = new Coleta(solicitante, listaResiduos);
				
		System.out.println("[Coleta] Solicitação incluida com sucesso: " + coleta);
	}

}

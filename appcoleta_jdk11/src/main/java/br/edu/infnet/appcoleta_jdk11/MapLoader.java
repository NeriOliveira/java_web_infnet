package br.edu.infnet.appcoleta_jdk11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Solicitante;


@Order(6)
@Component
public class MapLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Solicitante s1 = new Solicitante("Maria", "111", "maria@al.infnet.edu.br");
		Solicitante s2 = new Solicitante("Jose", "123", "jose@al.infnet.edu.br");
		Solicitante s3 = new Solicitante("Otavio", "234", "otavio@al.infnet.edu.br");


		List<Solicitante> lista = new ArrayList<Solicitante>();
		
		Map<String, Solicitante> mapa = new HashMap<String, Solicitante>();
		
		mapa.put("111", s1);
		mapa.put("123", s2);
		mapa.put("234", s3);
		
		for(Solicitante v: mapa.values()) {
			System.out.println("value for_each: " + v);
		}
		
		System.out.println("keyset: " + mapa.keySet());
		System.out.println("values: " + mapa.values());
		System.out.println("get: " + mapa.get("111"));
		System.out.println("get: " + mapa.get("546"));
		System.out.println("get: " + mapa.get("234"));
		System.out.println("get: " + mapa.get("123"));
		
		mapa.remove("234");
		System.out.println("get (removido): " + mapa.get("234"));
		
	}

}

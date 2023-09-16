package br.edu.infnet.appcoleta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcoleta.model.negocio.Solicitante;


@Order(6)
@Component
public class MapLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Solicitante s1 = new Solicitante("Maria", "123.000.000-00", "maria@al.infnet.edu.br");
		Solicitante s2 = new Solicitante("Jose", "321.000.000-00", "jose@al.infnet.edu.br");

		List<Solicitante> lista = new ArrayList<Solicitante>();
		
		Map<String, String> mapa = new HashMap<String, String>();
		
		mapa.put("111", "maria");
		mapa.put("123", "jose");
		mapa.put("234", "otavio");
		
		for(String v: mapa.values()) {
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

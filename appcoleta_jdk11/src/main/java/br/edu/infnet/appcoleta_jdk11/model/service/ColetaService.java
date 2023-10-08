package br.edu.infnet.appcoleta_jdk11.model.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Coleta;

@Service
public class ColetaService {
	
	public Map<LocalDateTime, Coleta> mapaColeta = new HashMap<LocalDateTime, Coleta>();
	
	private Integer id = 0;
	
	public Collection<Coleta> obterLista(){
		return mapaColeta.values();
	}
	
	public void incluir(Coleta coleta) {
		
		id++;
		coleta.setId(id);
		mapaColeta.put(coleta.getData(), coleta);
		System.out.println("[Coleta ID: " + coleta.getId() + "] Solicitação de coleta realizada com sucesso: " + coleta);
	}
	
	public void excluir(Integer id) {
		mapaColeta.remove(id);
	}
	
}

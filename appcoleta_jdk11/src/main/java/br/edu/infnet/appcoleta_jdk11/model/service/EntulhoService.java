package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Entulho;

@Service
public class EntulhoService {
	
	private Map<Integer, Entulho> mapaEntulho = new HashMap<Integer, Entulho>();
	
	public Collection<Entulho> obterLista(){
		return mapaEntulho.values();
	}
	
	public void incluir(Entulho entulho) {
		mapaEntulho.put(entulho.getCodigo(), entulho);
		System.out.println("[Óleo " + entulho.getCodigo() + "] Solicitação de coleta realizada com sucesso: " + entulho);
	}
	
	public void excluir(Integer codigo) {
		mapaEntulho.remove(codigo);
	}
	
}

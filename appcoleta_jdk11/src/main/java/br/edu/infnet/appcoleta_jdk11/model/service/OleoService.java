package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Oleo;

@Service
public class OleoService {
	
	private Map<Integer, Oleo> mapaOleo = new HashMap<Integer, Oleo>();
	
	public Collection<Oleo> obterLista(){
		return mapaOleo.values();
	}
	
	public void incluir(Oleo oleo) {
		mapaOleo.put(oleo.getCodigo(), oleo);
		System.out.println("[Óleo " + oleo.getCodigo() + "] Solicitação de coleta realizada com sucesso: " + oleo);
	}
	
	public void excluir(Integer codigo) {
		mapaOleo.remove(codigo);
	}
	
}
